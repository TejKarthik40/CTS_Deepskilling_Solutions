import React, { useState } from "react";
import CurrencyConverter from "./CurrencyConverter";

function App() {

  const [count, setCount] = useState(0);

  const increment = () => {
    setCount(count + 1);
  };

  const decrement = () => {
    setCount(count - 1);
  };

  const sayHello = () => {
    alert("Hello! Member");
  };

  const increaseAndHello = () => {
    increment();
    sayHello();
  };

  const sayWelcome = (msg) => {
    alert(msg);
  };

  const onPress = () => {
    alert("I was clicked");
  };

  return (
    <div style={{ margin: "20px" }}>

      <h2>{count}</h2>

      <button onClick={increaseAndHello}>
        Increment
      </button>

      <br /><br />

      <button onClick={decrement}>
        Decrement
      </button>

      <br /><br />

      <button onClick={() => sayWelcome("Welcome")}>
        Say Welcome
      </button>

      <br /><br />

      <button onClick={onPress}>
        Click on me
      </button>

      <CurrencyConverter />

    </div>
  );
}

export default App;