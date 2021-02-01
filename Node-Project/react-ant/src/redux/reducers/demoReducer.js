import {INCREMENT} from "../action_types";

export default function operateCount(preState = 0, action) {
  console.log("reducer", preState, action);
  // 在reducer中不可用修改传递过来的参数
  let curState = preState;
  const { type, data } = action;
  switch (type) {
    case INCREMENT:
      curState += data;
      break;
    default:
      break;
  }
  return curState;
}
