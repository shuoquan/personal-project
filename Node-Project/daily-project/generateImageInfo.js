const path = require('path');
const fs = require('fs');
const { Pool } = require('pg');
const getEtag = require('./qetag');

const annoConfig = {
  dev: {
    user: 'postgres',
    password: '1234567',
    host: 'localhost',
    database: 'annotest',
    port: 5433,
  },
  test: {
    user: 'postgres',
    password: 'postgres',
    host: 'localhost',
    database: 'annotest',
    port: 5432,
  },
  old: {
    user: 'anno',
    password: 'anno.1234',
    host: '10.8.0.54',
    database: 'anno',
    port: 5432,
  },
  new: {
    user: 'anno',
    password: 'anno.1234',
    host: '10.8.0.62',
    database: 'anno',
    port: 5432,
  },
};

const datasetConfig = {
  dev: {
    user: 'postgres',
    password: '1234567',
    host: 'localhost',
    database: 'annotest',
    port: 5433,
  },
  test: {
    user: 'postgres',
    password: 'postgres',
    host: 'localhost',
    database: 'annotest',
    port: 5432,
  },
  old: {
    user: 'anno',
    password: 'anno.1234',
    host: '10.8.0.54',
    database: 'dataset',
    port: 5432,
  },
  new: {
    user: 'anno',
    password: 'anno.1234',
    host: '10.8.0.62',
    database: 'dataset',
    port: 5432,
  },
};

// 输入方式  node generateImageInfo.js dasetId name prod
const arguments = process.argv.splice(2);
if (arguments.length < 3) {
  throw new Error('错误的参数数量');
}
const [datasetId, name, env] = arguments;
console.log(datasetId, name, env);
const annoPool = new Pool(annoConfig[env || 'new']);
const datasetPool = new Pool(datasetConfig[env || 'new']);
function annoQuery(text, params) {
  return annoPool.query(text, params);
}
function dataSetQuery(text, params) {
  return datasetPool.query(text, params);
}
async function main() {
  const {
    rows: datasets,
  } = await dataSetQuery('select * from dataset where id = $1', [datasetId]);
  const dataset = datasets[0];
  const {
    rows: datasetTasks,
  } = await dataSetQuery('select * from dataset_task where dataset_id = $1', [
    datasetId,
  ]);
  const imageIds = datasetTasks.reduce((last, cur) => {
    // if (dataset.type == 1) {
    //   last = last.concat(cur.img_ids_train);
    // } else if (dataset.type == 1) {
    //   last = last.concat(cur.img_ids_val);
    // }
    last = last.concat(cur.img_ids_train, cur.img_ids_val);
    return last;
  }, []);
  const { rows: imageList } = await dataSetQuery(
    `select * from image where image_id in (${imageIds.join(',')})`,
  );
  const imageInfo = imageList.reduce((last, cur) => {
    last[cur.image_id] = cur.path;
    return last;
  }, {});
  const { rows: annoImageInfo } = await annoQuery(
    `select * from image where id in (${imageIds.join(',')})`,
  );
  const annoImageMap = annoImageInfo.reduce((last, cur) => {
    last[cur.id] = cur.name;
    return last;
  }, {});
  const result = Object.keys(annoImageMap).reduce((last, cur) => {
    if (imageInfo[cur]) {
      last.push({
        url: imageInfo[cur],
        name: annoImageMap[cur],
      });
    }
    return last;
  }, []);
  fs.writeFile(`./${name}.txt`, JSON.stringify(result), (err) => {
    if (err) {
      console.log(err);
    }
    console.log('success');
  });
}
main();
