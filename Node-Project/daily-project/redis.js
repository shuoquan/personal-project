/**
 * 有关redis
 */
const redis = require('redis');

const client = redis.createClient(6379, '127.0.0.1');
// client.on('connect',()=>{
//     client.get('a',(err,data)=>{
//         console.log('11',data)
//     })
//     }
// )
// client.get('name',(err,data)=>{
//     console.log('11',data)
// })
client.set('name', 'alice', (err, data) => {
  console.log('22', data);
});
console.log('tt');
client.expire('name', 20, (err, data) => {
  console.log('33', data);
});
