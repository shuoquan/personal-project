const wordBreak = function(s, wordDict) {
  if (!wordDict.length) return false;
  wordDict = wordDict.sort((a, b) => a.length - b.length);
  const tempWordDic = [...wordDict];
  let flag = false;
  let a = false;
  while (!a) {
    const temp = [];
    for (let i = 0; i < wordDict.length; i += 1) {
      if (wordDict[i] === s) {
        flag = true;
        a = true;
        break;
      }
      if (i === 0 && wordDict[i].length > s.length) {
        a = true;
        break;
      }
      tempWordDic.forEach(v => {
        if (wordDict[i] === s.slice(0, wordDict[i].length)) {
          temp.push(wordDict[i].concat(v));
        }
      });
    }
    wordDict = temp;
    // console.log(temp)
    a = !temp.length;
    console.log(temp)
  }
  return flag;
};

console.log(
  wordBreak(
    "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab",
    [
      "a",
      "aa",
      "aaa",
      "aaaa",
      "aaaaa",
      "aaaaaa",
      "aaaaaaa",
      "aaaaaaaa",
      "aaaaaaaaa",
      "aaaaaaaaaa"
    ]
  )
);
