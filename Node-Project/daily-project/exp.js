const childProcess = require("child_process");
// const arguments = process.argv;
// console.log(arguments)
// childProcess.exec("node ./process.js", (err, stdout, stderr) => {
//   console.log(err, '11');
//   console.log(stdout, '22');
//   console.log(stderr, '33');
// });
// const obj = {
//   name: 'bob',
//   age: 12,
// };
// console.log(JSON.stringify(obj));
// console.log(
//   JSON.stringify(
//     obj,
//     (key, value) => {
//       if (key === 'age') value = 13;
//       return value;
//     },
//     2,
//   ),
// );

// const reg1 = /\"/g;
// const reg2 = /[\{\(]/g;
// const reg3 = /[\}\)]/g;
// const str = "{\"((197,337),(219,323),(235,353),(240,480))\"}";
// console.log(
//   str
//     .replace(reg1, "")
//     .replace(reg2, "[")
//     .replace(reg3, "]")
// );

// function timeout() {
//   return new Promise(resolve => {
//     setTimeout(() => {
//       resolve("hello");
//     }, 1000);
//   });
// }
// async function tt() {
//   const result = await timeout();
//   console.log(result);
//   console.log("tt");
// }
// tt();

// const result = {
//   status: '2'
// }
// console.log({
//   ...result,
//   status: parseInt(result.status)
// })
console.log({}.name);
