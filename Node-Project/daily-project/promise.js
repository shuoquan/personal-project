function a() {
  return new Promise(resolve => {
    setTimeout(()=>{
      resolve('hello')
    }, 10000*Math.random())
    // resolve("hello");
  });
}

function c() {
  return new Promise((resolve, reject) => {
    reject("fail");
  });
}

async function b() {
  try {
    // const result = await a();
    // const result1 = await c();
    // console.log(result);
    // console.log(result1);
    // await Promise.all([a(),a()]).then(res=>{
    //   console.log(res)
    // }).catch(err=>{
    //   console.log(err, 'err')
    // })
    const arr = Array(1000000).fill(0);
    // for(let i=0;i<100;i++){
    //   arr[i] = i;
    // }
    const list = [];
    let s = 1;
    console.log(new Date().getTime()/1000)
    await Promise.all(
      arr.map(async v => {
        // const result = await a();
        const random = parseInt(Math.random() * 10000);
        if(s===1){
          setTimeout(()=>{
            s+=1;
          }, 1000);
        }
        if (!list.includes(random)) {
          list.push(random);
        }
      })
    ).then(res => {
      console.log('s', s)
      setTimeout(()=>{
        console.log(s, 'ss')
      },10000)
      console.log(new Date().getTime()/1000)
      console.log(list);
      let map = {};
      let flag = false;
      for (let i = 0; i < list.length; i++) {
        if (!map[list[i]]) {
          map[list[i]] = 1;
        } else {
          flag = true;
          break;
        }
      }
      console.log(flag)
      // console.log(res);
    });
  } catch (e) {
    console.log(e, "ff");
  }
}

b();
