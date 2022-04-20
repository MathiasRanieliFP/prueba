import { Fragment } from "react";
import "./navigation-style.css"
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faStar, faArrowDown } from "@fortawesome/free-solid-svg-icons";



export const Navigation = (props) => {
    function abrirCerrarDropdown() {
      document.getElementById("filtros").classList.toggle("show");
      document.getElementById("btn-dropdown").classList.toggle("arreglo")
    }
    const categorias = props.categorias
    const idiomas = props.idiomas 
    
   
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
                            <p><input type="checkbox" name={category.name}/><label>{category.name}</label></p>
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
                            <p><input type="checkbox" name={idioma.name}/><label>{idioma.name}</label></p>
                          </Fragment>
                          )
                        })
                      }
                    </div>
                    <div className="valoraciones"><h5>Valoración</h5>
                    <p><input type={"checkbox"}></input><label><FontAwesomeIcon icon={faStar}/><FontAwesomeIcon icon={faStar}/><FontAwesomeIcon icon={faStar}/><FontAwesomeIcon icon={faStar}/><FontAwesomeIcon icon={faStar}/></label></p>
                    <p><input type={"checkbox"}></input><label><FontAwesomeIcon icon={faStar}/><FontAwesomeIcon icon={faStar}/><FontAwesomeIcon icon={faStar}/><FontAwesomeIcon icon={faStar}/></label></p>
                    <p><input type={"checkbox"}></input><label><FontAwesomeIcon icon={faStar}/><FontAwesomeIcon icon={faStar}/><FontAwesomeIcon icon={faStar}/></label></p>                    
                    <p><input type={"checkbox"}></input><label><FontAwesomeIcon icon={faStar}/><FontAwesomeIcon icon={faStar}/></label></p>                    
                    <p><input type={"checkbox"}></input><label><FontAwesomeIcon icon={faStar}/></label></p>                    
                    </div>
                    <div className="aplicar">
                        <button className="btn-aplicar">Aplicar</button>
                    </div>
                </div>
            </div>
        </div>

      </Fragment>
    );
};