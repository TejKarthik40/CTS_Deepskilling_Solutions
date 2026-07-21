import office from "./office.avif";

function App() {

  const officeSpaces = [

    {
      Name: "DBS",
      Rent: 50000,
      Address: "Chennai",
      Image: office
    },

    {
      Name: "Regus",
      Rent: 75000,
      Address: "Bangalore",
      Image: office
    },

    {
      Name: "WeWork",
      Rent: 90000,
      Address: "Hyderabad",
      Image: office
    }

  ];

  return (

    <div style={{ marginLeft: "40px" }}>

      <h1>Office Space, at Affordable Range</h1>

      {

        officeSpaces.map((item, index) => (

          <div key={index}>

            <img
              src={item.Image}
              alt="Office Space"
              width="25%"
              height="25%"
            />

            <h2>Name: {item.Name}</h2>

            <h3
              style={{
                color: item.Rent < 60000 ? "red" : "green"
              }}
            >
              Rent: Rs. {item.Rent}
            </h3>

            <h3>Address: {item.Address}</h3>

            <hr />

          </div>

        ))

      }

    </div>

  );

}

export default App;