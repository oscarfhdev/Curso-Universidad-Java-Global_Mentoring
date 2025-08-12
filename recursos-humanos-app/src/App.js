import ListadoEmpleados from "./empleados/ListadoEmpleados";
import Navegacion from "./empleados/Navegacion"

function App() {
  return (
    <div className="container">
      <Navegacion/>
      <ListadoEmpleados/>
    </div>
  );
}

export default App;
