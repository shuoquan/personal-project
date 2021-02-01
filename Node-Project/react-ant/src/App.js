import React, { Component } from "react";
import logo from "./logo.svg";
import "./App.css";
import { Route, Switch } from "react-router-dom";
import Login from "./pages/login/Login";
import Home from "./pages/home/Home";
import CountDemoContainer from "./pages/demo/CountDemoContainer";
export default class App extends Component {
  render() {
    return (
      <>
        <Switch>
          <Route path="/login" component={Login}></Route>
          <Route path="/home" component={Home}></Route>
          <Route path="/demo" component={CountDemoContainer}></Route>
        </Switch>
      </>
    );
  }
}
