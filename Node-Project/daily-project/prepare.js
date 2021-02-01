// for(var i=0; i<5; i++) {
//     setTimeout(()=>{
//         console.log(i)
//     })
// }

// const a = 99;
// f();
// console.log(a);
// function f() {
//   console.log(a);
//   var a = 10;
//   console.log(a);
// }

function fruits() {}

fruits.prototype = {
  color: "red",
  say: function() {
    console.log("My color is " + this.color);
  }
};
let apple = new fruits();
apple.say.apply(
  {
    color: "green"
  },
    [1,2,3]
);

// console.log.apply(console, [1,2,3])

// var apple = new fruits();
// apple.say.call({
//     color: "hapi",
//     say: function(){
//         console.log("haha")
//     }
// });

// function log(){
//     console.log.apply(console, arguments);
// };
// log(1);    //1
// log(1,2)

// var arr=[[1,2],[3,4]];
// function Jw(obj){
//     // return Array.prototype.concat.apply([],obj);
//     return [].concat.apply([], arr)
// }
// console.log(Jw(arr));

// const arr = [[[1,2], [2,3], [3,4]]];
// console.log(arr.join().split(','))
// console.log(arr.toString())


const list = ["nick"];
const arr = [{name: "bob",age:12}, {name: "curry", age:12}];
// list.push(...arr.map(v=>v.name));
[].push.apply(list, arr.map(v=>v.name))
console.log(list)
