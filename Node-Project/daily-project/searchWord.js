const exist = function(board, word) {
  const path = [];
  for (let i = 0; i < board.length; i += 1) {
    for (let j = 0; j < board[0].length; j += 1) {
      path.push([i, j, board[i][j]]);
    }
  }
  const flag = false;
  return !!findWord(board, word, path, board.length, board[0].length, flag);
};

const findWord = function(board, word, path, height, width, flag) {
  for (let i = 0; i < path.length; i += 1) {
    if (flag) {
      return flag;
    }
    if (i > 0) {
      board[path[i - 1][0]][path[i - 1][1]] = path[i - 1][2];
    }

    if (board[path[i][0]][path[i][1]] === word[0]) {
      board[path[i][0]][path[i][1]] = 0;
      if (word.length === 1) {
        flag = true;
        return flag;
      }
      const newPath = [];
      if (path[i][1] + 1 < width && board[path[i][0]][path[i][1] + 1]) {
        newPath.push([
          path[i][0],
          path[i][1] + 1,
          board[path[i][0]][path[i][1] + 1]
        ]);
      }
      if (path[i][0] + 1 < height && board[path[i][0] + 1][path[i][1]]) {
        newPath.push([
          path[i][0] + 1,
          path[i][1],
          board[path[i][0] + 1][path[i][1]]
        ]);
      }
      if (path[i][1] - 1 >= 0 && board[path[i][0]][path[i][1] - 1]) {
        newPath.push([
          path[i][0],
          path[i][1] - 1,
          board[path[i][0]][path[i][1] - 1]
        ]);
      }
      if (path[i][0] - 1 >= 0 && board[path[i][0] - 1][path[i][1]]) {
        newPath.push([
          path[i][0] - 1,
          path[i][1],
          board[path[i][0] - 1][path[i][1]]
        ]);
      }
      flag = findWord([...board], word.slice(1), newPath, height, width, flag);
    }
  }
  return flag;
};

console.log(
  exist(
    [
      ["b", "a", "a", "b", "a", "b"],
      ["a", "b", "a", "a", "a", "a"],
      ["a", "b", "a", "a", "a", "b"],
      ["a", "b", "a", "b", "b", "a"],
      ["a", "a", "b", "b", "a", "b"],
      ["a", "a", "b", "b", "b", "a"],
      ["a", "a", "b", "a", "a", "b"]
    ],
    "aabbbbabbaababaaaabababbaaba"
  )
);
