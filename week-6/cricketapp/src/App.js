import { ListofPlayers, ScoreBelow70 } from "./ListofPlayers";

function App() {

  const flag = true;

  if (flag) {
    return (
      <div>
        <ListofPlayers />
        <hr />
        <ScoreBelow70 />
      </div>
    );
  }

  return <div></div>;
}

export default App;