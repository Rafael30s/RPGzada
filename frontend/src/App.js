import logo from './logo.svg';
import Header from "./components/Header";
import FormLogin from "./components/FormLogin"
import './assets/App.css';
import "./assets/index.css";
import { ReactComponent as ImagemHome } from "./assets/img/ImagemHome.svg";

function App() {
  return (
    <div className="App">
      <Header />
      <header className="App-header">

        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
      <main>
        <div>
         <ImagemHome width="500px"/>
        </div>
        <div>
          <FormLogin/>
        </div>
      </main>

    </div>
  );
}

export default App;
