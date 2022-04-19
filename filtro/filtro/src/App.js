import { Navigation } from "./components/navigation/navigation-component";

const categorias = 
[
{id:1, name:"Kotlin"},
{id:2, name:"React"},
{id:3, name:"..."}
];
const idiomas = 
[
{id:1, name:"Español"},
{id:2, name:"Inglés"}
]
const datos = {categorias,idiomas}
const App = () => {
  return (

    <Navigation datos = {datos} />


  );
}

export default App;
