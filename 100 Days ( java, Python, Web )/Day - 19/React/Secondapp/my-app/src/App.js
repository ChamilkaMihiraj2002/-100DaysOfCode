import Header from './Components/Header';
import Main from './Components/Main';
import Sidebar from './Components/Sidebar';
import './App.css';

function App() {
  return (
    <>
      <Header name = "anne" color = "Red"/>
      <div className='container'>
        <Main greet = "HI"/>
        <Sidebar greet = "Chamilka"/>
      </div>
    </>
  );
}

export default App;
