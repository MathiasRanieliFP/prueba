import { Navigation } from "./components/navigation/navigation-component";

const categorias = 
[
{id:1, name:"Kotlin", check: false},
{id:2, name:"React", check: false},
{id:3, name:"...", check: false}
];

const idiomas = 
[
{id:1, name:"Español", check: false},
{id:2, name:"Inglés", check: false}
];

const valoracion =
[
  {id:1, value:1, check: false},
  {id:2, value:2, check: false},
  {id:3, value:3, check: false},
  {id:4, value:4, check: false},
  {id:5, value:5, check: false}
]

const App = () => {
  return (

    <Navigation categorias={categorias} idiomas={idiomas} valoracion={valoracion} />


  );
}

export default App;
