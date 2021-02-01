const divide = function (dividend, divisor) {
  const a = Math.abs(dividend);
  const b = Math.abs(divisor);
  if (divisor === -1) {
    if (-dividend > 2 ** 31 - 1 || -dividend < -(2 ** 31)) return 2 ** 31 - 1;
    return -dividend;
  }
  if (divisor === 1) {
    if (dividend > 2 ** 31 - 1 || dividend < -(2 ** 31)) return 2 ** 31 - 1;
    return dividend;
  }
  let start = 1;
  // let count = 0;
  while (b * start < a) {
    start *= 2;
  }
  if (b * start === a) {
    return dividend * divisor > 0 ? start : -start;
  }
  while (b * start > a) {
    start -= 1;
  }
  return dividend * divisor > 0 ? start : -start;
};

// const getResult = function(param){
//   if (param > 2 ** 31 - 1 || param < -(2 ** 31)) return 2 ** 31 - 1;
//   return param;
// }
console.log(divide(-2147483648, -1));
