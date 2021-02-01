import React, { Component } from "react";
import store from "../redux/store";
import {createIncrement} from "../redux/actions/demoAction";

export default class Home extends Component {
  constructor(props) {
    super(props);
    this.state = {
      count: 0
    };
  }


  componentDidMount() {
    // console.log(store.getState());
    console.log(this.props.increment, 'props')

  }

  render() {

    return (
      <>
        <h1>当前数值: {this.props.count}</h1>
        <select ref="selectNum">
          <option value="1">1</option>
          <option value="2">2</option>
          <option value="3">3</option>
        </select>
        <button onClick={() => {
          this.props.incrementAsync(this.refs.selectNum.value * 1, 1000);
          // store.dispatch(createIncrement(this.refs.selectNum.value * 1));
        }}>+
        </button>
        <button>-</button>
        <button>add if odd</button>
      </>
    );
  }
}
