// part1-深拷贝JSON.parse(JSON.stringify(obj))的劣势
function Person(name) {
  this.name = name;
  this.eat = function() {
    console.log("恰饭");
  };
}

const person = new Person("李四");

const obj = {
  name: "aa",
  p: person
};
// const obj1 = JSON.parse(JSON.stringify(obj));
// const obj2 = { ...obj };
// console.log(obj);
// console.log(obj1);
// console.log(obj2);

const time = {
  date: {
    today: "2020-1-29"
  }
};
// console.log(typeof time.date);
// console.log(typeof JSON.parse(JSON.stringify(time)).date);

// part2-js原型链
// function Person(name, age){
//     this.name = name;
//     this.age = age;
// }
// Person.prototype.MaxNumber = 9999;
// Person.__proto__.MinNumber = -9999;
// const will = new Person("Will", 28);
// console.log(will.MaxNumber); // 9999
// console.log(will.MinNumber); // undefined
// const bob = new Person("bob", 28);
// console.log(bob.MaxNumber)
// console.log(Person.prototype.constructor.__proto__);
// console.log(Person.__proto__.__proto__)

// const info = {
//   name: "bob"
// };
// info.toString = function() {
//   console.log("闭包");
// };
// // console.dir(info.__proto__);
// console.log(info.toString());
//
// const info2 = {
//     name: 'alice'
// }
// console.log(info2.toString())
