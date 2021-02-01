import CountDemo from "../../components/CountDemo";
import { connect } from "react-redux";
import { createIncrement, createIncrementAsync } from "../../redux/actions/demoAction";

// function mapStateToProps(state) {
//   return {
//     count: state
//   };
// }
//
// function mapDispatchToProps(dispatch) {
//   return {
//     increment: value => {
//       dispatch(createIncrement(value));
//     }
//   };
// }

// export default connect(mapStateToProps, mapDispatchToProps)(CountDemo);
export default connect(
  state => ({
    count: state.demoReducer
  }),
  {
    increment: createIncrement,
    incrementAsync: createIncrementAsync
  }
)(CountDemo);
