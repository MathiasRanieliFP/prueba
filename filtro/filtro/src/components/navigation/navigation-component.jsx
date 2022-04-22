import { Fragment } from "react";
import "./navigation-style.css"
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faStar, faArrowDown } from "@fortawesome/free-solid-svg-icons";
import { Estrellas } from "./estrellas-component";



export const Navigation = (props) => {
    function abrirCerrarDropdown() {
      document.getElementById("filtros").classList.toggle("show");
      document.getElementById("btn-dropdown").classList.toggle("arreglo")
    }
    const categorias = props.categorias
    const idiomas = props.idiomas 
    const valoracion = props.valoracion 

    const checkboxChangeCategorias = (event) => {
      console.log(event.target.value);

      categorias.map( c => {
        if(c.name === event.target.value){
          return c.check = event.target.checked;
        }
      });
    }

    const checkboxChangeIdiomas = (event) => {
      console.log(event.target.value);

      idiomas.map( i => {
        if(i.name === event.target.value){
          return i.check = event.target.checked;
        }
      })
    }

    const clickAplicar=() => {
      let salida = "bd.libros.find( $and: [{$or:["
      categorias.map(c => {

        if(c.check){
          salida+= "{\"categoria\":\""+c.name+"\"}," 
        }

      });

      salida+="]}, {$or:["

      idiomas.map(i => {

        if(i.check){
          salida+= "{\"idioma\":\""+i.name+"\"},"
        }

      });

      salida+= "]}]});"

      console.log(salida);
    }

    return (
      <Fragment>
        <div className='navigation'>
            <div className= "dropdown">
                <button onClick={abrirCerrarDropdown} id="btn-dropdown" className="btn-dropdown" >Elige una opción <FontAwesomeIcon icon={faArrowDown}/></button>
                <div className="filtros" id="filtros">
                     <div className="categorias"><h5>Categorías</h5>
                      {
                        categorias.map(category =>{
                          return(
                            <Fragment key={category.id}>
                              <p><input type="checkbox" name="categorias" value={category.name} onChange={checkboxChangeCategorias} /><label>{category.name}</label></p>
                            </Fragment>
                          )
                        })
                      }
                    </div> 
                    <div className="idiomas"> <h5>Idiomas</h5>
                    {
                        idiomas.map(idioma =>{
                          return(
                            <Fragment key={idioma.id}>
                              <p><input type="checkbox" name="idiomas" value={idioma.name} onChange={checkboxChangeIdiomas} /><label>{idioma.name}</label></p>
                            </Fragment>
                          )
                        })
                      }
                    </div>
                    <div className="valoraciones"><h5>Valoración</h5>
                    {
                      valoracion.map(val =>{
                        return(
                          <Fragment>
                            <p><input type="checkbox" name="valoracion" value={val.value} />
                              <Estrellas numEstrellas= {val.value} />
                            </p>
                          </Fragment>
                        )
                      })
                    }
                    <p><input type={"checkbox"} value= "5"></input><label><FontAwesomeIcon icon={faStar}/><FontAwesomeIcon icon={faStar}/><FontAwesomeIcon icon={faStar}/><FontAwesomeIcon icon={faStar}/><FontAwesomeIcon icon={faStar}/></label></p>
                    <p><input type={"checkbox"}></input><label><FontAwesomeIcon icon={faStar}/><FontAwesomeIcon icon={faStar}/><FontAwesomeIcon icon={faStar}/><FontAwesomeIcon icon={faStar}/></label></p>
                    <p><input type={"checkbox"}></input><label><FontAwesomeIcon icon={faStar}/><FontAwesomeIcon icon={faStar}/><FontAwesomeIcon icon={faStar}/></label></p>                    
                    <p><input type={"checkbox"}></input><label><FontAwesomeIcon icon={faStar}/><FontAwesomeIcon icon={faStar}/></label></p>                    
                    <p><input type={"checkbox"}></input><label><FontAwesomeIcon icon={faStar}/></label></p>                    
                    </div>
                    <div className="aplicar">
                        <button className="btn-aplicar" onClick={clickAplicar} >Aplicar</button>
                    </div>
                </div>
            </div>
        </div>

      </Fragment>
    );
};