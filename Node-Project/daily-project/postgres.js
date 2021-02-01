const { Pool } = require('pg');

const pool = new Pool({
  user: 'postgres',
  password: 'postgres',
  host: 'localhost',
  database: 'anno',
  port: 5432,
});
pool.query('select * from industry where id= 1').then(res=>{
    console.log(res)
})
