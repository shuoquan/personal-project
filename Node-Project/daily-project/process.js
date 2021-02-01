// const arr = [1, 3, 2];
// console.log(Math.max(...arr));
// console.log(Math.max.apply(-Infinity, arr));
// console.log(Math.max.call(...arr));
// console.log(Math.max.bind(...arr)());

// function A() {
//   const name = 'bob';
//   return function (){
//     console.log('hihi');
//   };
// }
// A()()

// let time = setTimeout(() => {
//   time = "pp";
//   console.log("nice");
// }, 1000);
// // clearTimeout(time);
// console.log(time);
//
// setTimeout(()=>{
//     console.log(time);
// }, 1000)

// const obj = {
//   name: 'bob'
// };
// Object.freeze(obj);
// console.log(Object.isFrozen(obj))
// obj.name = 'alice';
// console.log(obj)

async function test(arr) {
  // for (let item of arr) {
  //   const result = await timeout(item);
  //   console.log(result);
  // }
  for await (const item of arr) {
    const result = timeout(item);
    console.log(result);
  }
  console.log('end');
}

async function timeout(item) {
  return new Promise((resolve) => {
    setTimeout(() => {
      resolve(item);
    }, 1000);
  });
}

function bubbleSort(list) {
  for (let i = 0; i < list.length; i++) {
    for (let j = 0; j < list.length - 1 - i; j++) {
      if (list[j] > list[j + 1]) {
        const temp = list[j];
        list[j] = list[j + 1];
        list[j + 1] = temp;
      }
    }
  }
  return list;
}
// console.log(bubbleSort([2, 3, 1, 5, 3]));
// console.log([...new Set([1,1,2])])

// setTimeout(function(){
//   console.log(1)
// });
// new Promise(function(resolve){
//   console.log(2);
//   for(var i = 0; i < 10000; i++){
//     i == 9999 && resolve();
//   }
// }).then(function(){
//   console.log(3)
// });
// console.log(4);

// async function async1() {
//   await async2();
//   console.log("async1 end");
// }
// async function async2() {
//   console.log("async2 end");
//   re;
// }
// console.log(async1());
// console.log("pp");

// const tt = [1, 2];
// console.log(tt.filter(v => (v === 2 ? v : v > 0)));


