import { INCREMENT } from "../action_types";

export const createIncrement = value => ({
  type: INCREMENT,
  data: value
});

export const createIncrementAsync = (value, delay) => {
  return dispatch => {
    setTimeout(() => {
      dispatch(createIncrement(value));
    }, delay);
  };
};
