import { Routes, Route } from "react-router-dom";
import { Navigation } from "./components/navigation/navigation-component";

const categorias = 
[
{id:1, name:"Kotlin"},
{id:2, name:"React"},
{id:3, name:"..."}
]
const idiomas = 
[
{id:1, name:"Español"},
{id:2, name:"Inglés"},
]
const App = () => {
  return (
    <Routes>
    <Route path='/' element={<Navigation categorias = {categorias} idiomas = {idiomas}/>}>
    
    </Route>
  </Routes> 
  );
}

export default App;
