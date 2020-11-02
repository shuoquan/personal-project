// const nextPremutation = function (nums) {
//   const objLen = nums.length;
//   let flag = 0;
//   let begin = -1;
//   let end = -1;
//   for (let i = objLen - 1; i > 0; i--) {
//     let index = i - 1;
//     for (let j = i - 1; j >= 0; j--) {
//       if (j >= 0 && nums[j] < nums[i]) {
//         flag = 1;
//         index = j;
//         break;
//       }
//     }
//     if (flag && index > end) {
//       begin = i;
//       end = index;
//     }
//   }
//   if (flag) {
//     const temp = nums[begin];
//     nums[begin] = nums[end];
//     nums[end] = temp;
//   }
//   const start = flag ? end + 1 : begin + 1;
//   for (let i = start; i < objLen; i++) {
//     let minIndex = i;
//     for (let j = i + 1; j < objLen; j++) {
//       if (nums[j] < nums[minIndex]) {
//         minIndex = j;
//       }
//     }
//     const temp = nums[i];
//     nums[i] = nums[minIndex];
//     nums[minIndex] = temp;
//   }
// };
// const x = [1, 2];
// nextPremutation(x);
// console.log(x);


