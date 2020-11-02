const info = require('./info.json');

console.log(info, typeof info);
const json = {
  485: {
    importNum: 10,
    importPrice: 10,
    exportNum: 6,
    sellNum: 4,
    sellPrice: 8,
  },
};

const next = {
  485: {
    importNum: 2,
    importPrice: 0,
    exportNum: 6,
    sellNum: 7,
    sellPrice: 14,
  },
  667: {
    importNum: 6,
    importPrice: 6,
    exportNum: 2,
    sellNum: 2,
    sellPrice: 4,
  },
};
console.log(Number.MAX_VALUE);
// console.log(JSON.stringify(json));
// console.log(JSON.stringify(next));
// console.log(JSON.parse('{}'));
// console.log([1, 2, 3].reverse());
// console.log('1'.padStart(2, '0'));
// console.log(new Date().getFullYear());
// console.log(new Date().getMonth());
// const object1 = { name: 'bob', age: 12 };
// const object2 = { ...object1 };
// object1.name = 'alice';
// console.log(object2);
(() => {
  console.log('haha');
})();

const arr = [1, 2, 3];
console.log(...arr);
console.log(0.1 - 0.1);
