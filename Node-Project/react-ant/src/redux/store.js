import { applyMiddleware, createStore } from "redux";
import reducers from "./reducers";
import thunk from "redux-thunk";
// 用于支持redux开发者调试者工具
import { composeWithDevTools } from "redux-devtools-extension";

export default createStore(
  reducers,
  composeWithDevTools(applyMiddleware(thunk))
);
