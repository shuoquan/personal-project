/**
 * leetcode 四元素问题
 * [1, 0, -1, 0, -2, 2],target:10
 * 找出数组中四个数和12的所有情况，不可以重复数组元素
 */

const arr = [1, 0, -1, 0, -2, 2]
const target = 0 ;
const len = arr.length;
const a = [];
const result = [];
const y = [];
for(let i=0;i<len;i++){
    for(let j=i+1;j<len;j++){
        const sum = arr[i]+arr[j];
        a.push([i,j,sum]);
    }
}
const length = a.length;
for(let m=0; m<length;m++){
    for(let n=m+1;n<length;n++){
        if(a[m][2]+a[n][2]===target){
            const list = [a[m][0],a[m][1],a[n][0],a[n][1]];
            let flag = 1;
            const z = [];
            for(const k of list){
                if(z.includes(k)){
                    flag = 0;
                    break
                }
                z.push(k)
            }
            // console.log(a[m][0],a[m][1],a[n][0],a[n][1])
            if(flag)
            {
                const temp = [arr[a[m][0]],arr[a[m][1]],arr[a[n][0]],arr[a[n][1]]].sort((a,b)=>{
                    return a>b?1:-1
                });
                const x = JSON.stringify(temp);
                if(!y.includes(x)){
                    y.push(x);
                    result.push(temp);
                }
            }

        }
    }
}
console.log(result)
