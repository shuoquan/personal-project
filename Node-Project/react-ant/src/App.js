import React, { Component } from "react";
import logo from "./logo.svg";
import "./App.css";
import { Route, Switch } from "react-router-dom";
import Login from "./pages/login/Login";

export default class App extends Component {
  render() {
    return (
      <div>
        <Switch>
          <Route path="/login" component={Login}></Route>
        </Switch>
      </div>
    );
  }
}
