import React from "react";
import logo from "./logo.svg";
import "./App.css";

const style={
  height: '30px',
  width: '30px'
};

class App extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      flag: true
    };
  }

  render() {
    return (
      <div className="App">
        <header className="App-header">
          <img src={logo} style={style} className="App-logo" alt="logo" />
          <p onClick={() => this.setState({ flag: !this.state.flag })}>
            Edit <code>src/App.js</code> and save to reload.
          </p>
          {this.state.flag && (
            <a
              className="App-link"
              href="https://reactjs.org"
              target="_blank"
              rel="noopener noreferrer"
            >
              Learn React
            </a>
          )}
        </header>
      </div>
    );
  }
}

export default App;
