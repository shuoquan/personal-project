const procExc = require('child_process').exec;
// const x = 1674094899;
// console.log(new Date(new Date().getTime()));
// console.log(new Date(new Date(x * 1000).toLocaleDateString()).getTime() / 1000 + 86400);
// console.log(new Date(new Date(1587633869807).toLocaleDateString()).getTime());

// console.log(new Date(new Date(new Date(1587868335 * 1000).toLocaleDateString()).getTime()));
// console.log(new Date(new Date(1587868335 * 1000).toLocaleDateString()));
// console.log(new Date('2020-04-26').getTime());
// const x = 1;
// const p = new Promise((resolve, reject) => {
//   reject((a, b = 2, c) => {
//     console.log(a, b, c);
//   });
// });
// p.then((res) => {
//   console.log(res);
// }, (result) => {
//   result(1, 3);
// });
// const arr = ['A','b','C','D','e','f'];
// const result = arr.map(v=>{
//     return v.toLowerCase()
// })
// console.log(result)

// procExc('mkdir fuck.txt',(err, stdout, stderr)=>{
//     console.log(err,stdout, stderr)
// })

const bcrypt = require('bcrypt');

const password = 'haishen-inc';

// bcrypt.hash(password, 10, (err, encryptPassword) => {
//   console.log(encryptPassword);
//   bcrypt.compare(password, encryptPassword, (err, res) => {
//     if (res === true) console.log('password is true');
//   });
// });
// bcrypt.compare(password, '$2b$10$zIEXVZMqtFQD/fW7Lt/da.u17g8JLq/c6paZC8neZ.8yEHG2cJ0wa', (err, res) => {
//   if (res === true) console.log('password is true');
// });
const s = {
  name: 'bob',
};
// console.log({
//     ...s,
//     age: '12'
// })
Object.assign(s, { age: '12' });
console.log(s);
