// const reg = /^[A-Z1-9]{4}$/
// console.log(/^[A-Z1-9]{4}$/.test('1243'))
// const num = 1200;
//
const moment = require('moment');
const { createHash } = require('crypto');
const urlencode = require('urlencode');
const promise = require('bluebird');
const fs = require('fs');
const xml = require('fast-xml-parser');
const Decimal = require('decimal');
const qs = require('querystring');
// const time = 1609344010000;
// console.log(new Date('2020-01-01'))

// const obj = {
//   a: 1,
//   b: 2
// }
// const obj1 = {
//   a:2,
//   b:3,
//   c:4
// }
// console.log(Object.assign({},obj,obj1))
// console.log(obj)
// console.log(obj1)
// const m = [{
//   id:1,
//   name:'ddd'
// },{
//   id:'2',
//   name:'ppp'
// }]
// console.log(m.find(v=>v.id===3))
// console.log(moment(1583483363000).format('YYYY-MM-DD HH:mm:ss'));
// console.log(new Date()>new Date('2020-02-02'))

// console.log(/^[A-Z]{2,4}$/.test('1BCD'));
// console.log(parseInt(undefined, 10) > 10);
// const a = '';
// if (a) console.log('ok');
// const test = { name: 'alice' };

// test.age = 'aa';
// console.log(test);
// console.log(parseInt(''));
// console.log((undefined || {}).name);
// const m = {};
// console.log(JSON.parse('[{}]')[0]);
// console.log('😂');
// console.log(m.reduce((acc, cur) => {
//   acc.push(cur);
//   return acc;
// }, []));
// const x = [1, 2, 3, 4, 5];
// const y = [2, 4];
// const z = [
//   ...x.filter((v) => {
//     if (y.includes(v)) return v + 1;
//   }),
//   ...x.filter((v) => {
//     if (!y.includes(v)) return v + 1;
//   }),
// ];
// console.log(z);
// if (y.includes(2)) console.log('ok');
// const z = y.filter((v) => v > 2);
// console.log(z);
// console.log(y);
// const test1 = [[[1174, 842], [1134, 970], [1360, 946.5]]];
// const temp = test1.map((v) => v.map((v) => v.map((v) => Math.round(v))));
// console.log(temp);

// const reg = /\s*$/;
// console.log(reg.test(''));
// const a = { name: 'alice' };
// const b = { ...a };
// a.name = 'bob';
// console.log(a, b);

/*
 * listForChose: 所有可以选取的值
 * sum 和
 * 目标： 从listForChose中选取所有和为sum的组合，可以重复， 比如sum=5，listForChose[1,2,5], 那么[1,1,1,1,1]是其中的一个解
 * 采用方案： 回溯法
 */
// const arr = new Array(11).fill(0);
// const listForChose = [1, 2, 5];
// function search(sum, m) {
//   console.log(sum, m);
//   for (let i = 1; i <= sum; i += 1) {
//     // console.log(m);
//     if (i >= arr[m - 1] && listForChose.includes(i)) {
//       arr[m] = i;
//       const rest = sum - i;
//       if (rest === 0 && m >= 1) {
//         console.log(arr.slice(1, m + 1));
//       } else {
//         search(rest, m + 1);
//       }
//       arr[m] = 0;
//     }
//   }
// }
// search(20, 1);

// console.log(new Date('2020-01-01'));
//
// console.log(moment().subtract(0, 'months').startOf('month').format('YYYY-MM-DD'));
//
// console.log(new Date(new Date(moment(new Date('2020-01-01').getTime()).subtract(1, 'months').startOf('month').format('YYYY-MM-DD')).toLocaleDateString()).getTime());
//
//
// console.log(typeof (undefined || 0));
//
// console.log(typeof moment().format('YYYY-MM-DD HH:mm:ss'));
// console.log(0.1 + 0.2);
//
// const a = ['abv', '12', '23'];
// console.log(a.sort().join());
// console.log(a);

const result = createHash('sha1')
  .update(
    'jsapi_ticket=kgt8ON7yVITDhtdwci0qeSoTJtQq-Z6yB4Wq_XYXsMR05LOjRaBVU5XHuQAx570NjqRLNUHJ0xtFfvl4z5sptQ&noncestr=1234567890&timestamp=1593260860&url=http://cpt28z.natappfree.cc/',
  )
  .digest('hex');
console.log(result);
console.log(urlencode('http://nzrazk.natappfree.cc/'));

console.log(parseInt((new Date().getTime() / 1000).toString(), 10));
// https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx208b5a3c50c0665c&redirect_uri=http%3A%2F%2Fnzrazk.natappfree.cc%2F&response_type=code&scope=snsapi_base&state=123#wechat_redirect

// const url = '123';
const url = 'http://nzrazk.natappfree.cc/?code=021B9cYC0LT4yh2yhSXC0BMrYC0B9cYt&state=123';
const urlSplit = url.slice(url.indexOf('?') + 1).split('&');
let code = null;
urlSplit.forEach((v) => {
  const index = v.indexOf('=');
  if (v.slice(0, index) === 'code') code = v.slice(index + 1);
});
// console.log(code);
// console.log(new Date(2020, 0, 1));
// console.log('a' || '{}');
// console.log(undefined || {});
// console.log(Math.random().toString().slice(-8));
// let i = 100;
// while (i > 0) {
//   console.log(Math.random()); i--;
// }

// console.log(new Date(new Date(moment(new Date().getTime()).subtract(1, 'months').startOf('month').format('YYYY-MM-DD')).toLocaleDateString()).getTime());
// console.log(new Date(moment(new Date().getTime()).subtract(1, 'months').startOf('month')).getTime());
// console.log(Object.keys({}));
// const a = { name: 'bob', age: 12 };
// Object.assign(a, { name: 'alice' });
// console.log(a);
// console.log(!null);
// console.log(new Date().getFullYear());
//
// console.log(new Date(moment().startOf('month').format('YYYY-MM-DD')).getTime());
// console.log(new Date(new Date(moment(new Date().getTime()).subtract(0, 'months').startOf('month').format('YYYY-MM-DD')).toLocaleDateString()).getTime());
// console.log(new Date(new Date(moment(new Date().getTime()).startOf('month').format('YYYY-MM-DD')).toLocaleDateString()));
// console.log(moment(new Date(
//   new Date(
//     moment(new Date().getTime())
//       .startOf('month')
//       .format('YYYY-MM-DD'),
//   ).toLocaleDateString(),
// )));
// const test = '123,345';
// console.log(test.split(','));

// let total = 100000000;
// const obj = {};
// while (total > 0) {
//   const result1 = Math.random().toString();
//   const length = result1.length - 2;
//   console.log(result1.slice(2, 10));
//   if (obj[length]) obj[length] += 1;
//   else obj[length] = 1;
//   total -= 1;
// }
// console.log(total);
// console.log('123'.slice(1));
// console.log(Math.random().toString().length);
// console.log('0.222'.slice(2, 10));

const arr = [55, 44, 22, 45, 56, 78, 23];
// console.log(arr.join(' '));
// arr.sort((a, b) => {
//   console.log(arr);
//   console.log(a, b);
//   return a - b;
// });
// arr.splice(0, 1, 33, 55, 77);
// console.log(arr);
// console.log('123'.split(','));

// promise.promisifyAll(arr);
// console.log(typeof arr)
async function f1() {
  promise.promisifyAll(fs);
  // fs.readFile('F:/chrome下载/MP_verify_fYKrCrNqF8rUKFhm (1).txt', (err, res) => {
  //   console.log(res.toString());
  // });
  const resu = await fs.readFileAsync(
    'F:/chrome下载/MP_verify_fYKrCrNqF8rUKFhm (1).txt',
  );
  console.log(resu.toString());
  console.log('ooo');
}
// f1();
// console.log(moment(1594191938000).format('YYYY-MM-DD HH:mm:ss'));
// console.log(Math.round(2.3));
// console.log(['2', '3', '12'].sort());

const name = 'hello';
const result1 = '<xml>'
  + `<ToUserName><![CDATA[${name}]></ToUserName>`
  + '<FromUserName><![CDATA[gh_011810c569a7]]></FromUserName>'
  + '<CreateTime>1548831860</CreateTime>'
  + '<MsgType><![CDATA[text]]></MsgType>'
  + '<Content><![CDATA[<a href="https://geewoo.com/X/dev/h5-front/home">点我进入首页</a>]]></Content>'
  + '</xml>';
console.log(result1);
const param1 = xml.parse(result1);
console.log(param1);
console.log(new xml.j2xParser().parse(param1));
console.log('123'.split(','));
const c = [1];
console.log(c[0], c[1]);
console.log(2 || 1);

const a = new Set([{ name: 'alice' }, { name: 'alice' }]);
console.log([...a]);

console.log(moment(new Date().toLocaleDateString()).add(1, 'days'));

// const list = [1, 2, 3];
// console.log(list.some((v) => v > 2));
// console.log('f43fa36a7d707fa525112f840f7ba99c3f901102f74042f039eef5447d560d96'.length);

const phoneList = [18742015363];
const ss = phoneList.some((v) => !/^[1][3,4,5,7,8,9][0-9]{9}$/.test(v));
console.log('fff', ss);

console.log(moment(1597033439000).format('YYYYMMDD'));

console.log([].some((v) => v.name));
console.log(parseInt(undefined));

console.log(
  JSON.stringify([
    {
      skuId: 667,
      packaging: 24,
      num: 2,
    },
    {
      skuId: 485,
      packaging: 12,
      num: 3,
    },
  ]),
);
console.log(
  JSON.stringify([
    'http://qiniu-mbox-front-img.haishen-inc.com/Fh_Dd8GzTD_Nq7_FjXP17CsYjZi6',
  ]),
);
console.log(
  JSON.stringify([
    {
      skuId: 667,
      num: 30,
    },
    {
      skuId: 485,
      num: 24,
    },
  ]),
);
console.log(
  JSON.stringify([
    {
      skuId: 667,
      num: 18,
    },
    {
      skuId: 485,
      num: 12,
    },
  ]),
);

console.log(moment(null).format('YYYYMMDD'));
console.log(
  JSON.stringify({
    19: [
      {
        skuId: 667,
        num: 30,
      },
      {
        skuId: 485,
        num: 24,
      },
    ],
  }),
);
console.log(moment('2020-08-11').unix() + 8 * 3600);
console.log(new Date('2020-08-11').getTime() / 1000);
// [{
//   skuId: 667, name: '瓶装统一冰红茶500ml', num: 2, packaging: 24,
// }];
// [{
//   skuId: 667, name: '瓶装统一冰红茶500ml', num: '2', packaging: '12', purchasePrice: '1',
// }];

// {"code":0,"message":"success","pickupNote":{"id":1,"storageId":19,"noteCode":"202008111901","status":0,"clerkApproveAt":"2020-08-11 16:20:58","actualSkuList":[],"skuList":[{"skuId":667,"packaging":24,"num":2},{"skuId":485,"packaging":12,"num":3}],"pickupDate":"2020-08-11","storageName":"淮安仓库","clerkName":"shuoquan","clerkPhone":"18915658568","receiptPicList":["http://qiniu-mbox-front-img.haishen-inc.com/Fh_Dd8GzTD_Nq7_FjXP17CsYjZi6"],"boxNoteList":[{"id":1,"boxCode":"MILK00001","replenishment":{"19":[{"skuId":667,"num":30},{"skuId":485,"num":24}]},"status":0,"replenishAt":null},{"id":2,"boxCode":"MILK00002","replenishment":{"19":[{"skuId":667,"num":18},{"skuId":485,"num":12}]},"status":0,"replenishAt":null}]}}
// console.log(parseInt(undefined) > 10);
// console.log(Decimal(null));
console.log(moment('2020-08-14').unix());
console.log(-(-2));
const list = [2, 3];
list.splice(0, 0, 1);
console.log(list);
console.log(new Date('2020-08-14').getTime());
console.log(new Date(new Date().toLocaleDateString()).getTime() / 1000, 1000);
const s = [1, 2];
s.splice(0, 1);
console.log(s);

console.log(parseInt((new Date().getTime() / 1000).toString(), 10));

const a1 = { name: 'alice' };
const b1 = { name: 'bob' };
console.log(Object.values(b1));

const obj = { 1: [1, 2] };
obj['1'].push(3);
console.log(obj);
console.log(!1);
console.log(moment('200814').unix());

const param = [1, 2];
// param.splice(1, 1);
// console.log(parseInt(1.2));

// const sss = param.filter((v) => {
//   if (v > 1) return v;
// });
// console.log(sss);
// console.log(!!0);
// if ({}) {
//   console.log('ff');
// }
// const str = '1,2、';
// console.log(str.substring(0, str.length - 1));

// const test = {
//   a: 5,
//   b: 6,
//   sum() {
//     return this.a + this.b; // 此处this = test
//   },
// };

console.log(
  moment()
    .startOf('month')
    .unix(),
);
console.log(moment().format('YYYY-MM'));
console.log(
  moment(1592878662 * 1000)
    .startOf('month')
    .unix(),
);
console.log(
  moment(1592878662 * 1000)
    .endOf('month')
    .unix() + 1,
);
console.log(1598889600 === 1598889600.0);
console.log(
  moment()
    .endOf('month')
    .unix(),
);
console.log(
  moment()
    .startOf('month')
    .subtract(-1, 'month'),
);
console.log('ffag');
console.log(moment().endOf('week'));
console.log(2.2 + 1.1);

console.log(moment() - 1);
// const temp = {
//
// };
// temp['2'] = 2;
// temp['1'] = 1;
// console.log(temp);
console.log(
  moment('1593532800' * 1000)
    .startOf('month')
    .unix(),
);
// console.log(
//   moment(moment(new Date())
//     .subtract(1, 'month')
//     .startOf('month')
//     .unix() * 1000).subtract(-1, 'month'),
// );

// const temp = {
//   23: '11',
// };
// const ab = {
//   123: '123',
// };
// console.log({ ...ab, ...temp });

const box = 'milk0001';
console.log([box]);
console.log(
  moment(new Date())
    .startOf('day')
    .unix(),
);
const curMonth = moment()
  .startOf('month')
  .unix();
const nextMonth = moment()
  .subtract(-1, 'month')
  .startOf('month')
  .unix();
console.log((nextMonth - curMonth) / 86400);
console.log(typeof moment(1607788800 * 1000).format('M/DD'));
console.log(new Decimal('0.123').toNumber().toFixed(2));
console.log(moment(1601198252));

console.log(
  moment(1601481600 * 1000)
    .subtract(1, 'month')
    .unix(),
);
console.log(
  moment((1601481600 - 1) * 1000)
    .startOf('month')
    .unix(),
);

console.log(undefined || '');
console.log(nextMonth);

const list1 = [
  {
    1: 1,
    checked: true,
  },
  {
    2: 2,
    checked: false,
  },
];
const list2 = list1.filter((v) => v.checked);
list2[0].checked = false;
console.log(list1, list2);

const abc = [1, 12];
console.log(abc[-1], 'ppp');

const ob = {
  name: {
    age: '12',
  },
};
let ssss = ob.name;
ob.name.age = '11';
ssss = 1;
console.log(ssss);

console.log(
  moment()
    .startOf('week')
    .unix(),
);

const rankList = [{ age: 12 }, { age: 13 }];
const index = rankList.findIndex((v) => v.age > 13);
console.log(index);

console.log(moment().unix());

console.log(null - 1);
console.log(null >= 0);

const sortList = [
  { name: 'bob', age: 12 },
  { name: 'alice', age: 11 },
];
const sortedList = sortList.sort((a, b) => b.age - a.age);
sortedList[0].name = 'qq';
console.log(sortList, sortedList);

const shiftList = [1, 2, 3];
// console.log(shiftList.shift());
// console.log(shiftList);
console.log(shiftList.unshift(7, 6, 7));
console.log(shiftList);

// const object = {
//   name: 'bob',
// };
// console.log(object.hasOwnProperty('age'));

const arr2 = [3, 4, 2];
arr2.sort((a, b) => a - b);
console.log(arr2);

function outFun() {
  const name = 'Chrome';
  function alertName() {
    console.log(name);
  }
  return alertName; // alertName被外部函数作为返回值返回了,返回的是一个闭包
}

// var myFun = outFun();
// myFun();
// console.log(outFun()())
// console.log(namex)
// var namex = "x"
// const timer = setTimeout(()=>{
//     console.log('haha')
// }, 1500)
// console.log(timer)
// setTimeout(()=>{
//     console.log(clearTimeout(timer), 'pp')
// }, 1000)

const start = new Date().getTime();
for (let i = 0; i < 1000000000; i += 1) {}
const end = new Date().getTime();
console.log((end - start) / 1000);

// const start = new Date().getTime();
// let begin = 1000000000;
// while(begin>0){
//     begin-=1;
// }
// const end = new Date().getTime();
// console.log((end - start) / 1000)

const one = new Promise((resolve, reject) => {
  resolve('one成功');
});

const two = new Promise((resolve, reject) => {
  reject('two成功');
});

const three = new Promise((resolve, reject) => reject('three失败'));

// Promise.race([one, two, three]).then(
//   (res) => {
//     console.log(res);
//   },
//   (err) => {
//     console.log('ee');
//     console.log(err);
//   },
// );

// const tt = new Promise((resolve, reject) => {
//   reject('hapi');
//   resolve('haha');
// });
// tt.then((result) => {
//   console.log(result);
// }).catch((err) => {
//   console.log(err);
// });

// console.log(
//   typeof qs.stringify({
//     name: 'bob',
//     age: 12,
//   }),
// );
//
// console.log({name:"bob"} instanceof Object);
