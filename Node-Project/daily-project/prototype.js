// 原型链经典
function Person(name, age) {
  this.name = name;
  this.age = age;
}
const person = new Person("bob", 12);
console.dir(Person.prototype);
console.log(person.__proto__ === Person.prototype); // true
console.log(Person === Person.prototype.constructor); // true
console.dir(typeof Person);

// function sum(start) {
//   if (start === 100) {
//     return 100;
//   } else {
//     return start + sum(start + 1);
//   }
// }
function feibo(n) {
  if (n === 1) {
    return 1;
  }
  if (n === 2) {
    return 1;
  }
  return feibo(n - 1) + feibo(n - 2);
}
console.log(feibo(4));

function sum(n) {
  if (n > 1) {
    return sum(n - 1) + n;
  }
  if (n === 1) {
    return 1;
  }
}
console.log(sum(100));
