import { Fragment, useState } from "react";
import { Outlet } from "react-router-dom";

import "bootstrap/dist/css/bootstrap.min.css";
import { Dropdown, DropdownItem, DropdownMenu, DropdownToggle } from "reactstrap";

import "./navigation-style.css"


export const Navigation = (props) => {
    const [dropdown, setDropdown] = useState(false);
    
    const abrirCerrarDropdown = () =>{
        setDropdown(!dropdown);
    }
    const{categorias} = props
    const{idiomas} = props   

    console.log(idiomas + "idi" + categorias +"cats")
    return (
      <Fragment>
        <div className='navigation'>
            <Dropdown isOpen={dropdown} toggle = {abrirCerrarDropdown} className= "dropdown">
                <DropdownToggle className="btn-dropdown" caret>Filtrar por... </DropdownToggle>
                <DropdownMenu>
                     <div className="categorias"><h6>Categorías</h6> <br/>
                      {
                        categorias.map(category =>{
                          return(
                            <Fragment>
                            <p><input type="checkbox" /><a>{category.name}</a></p>
                          </Fragment>
                          )
                        })
                      }
                    </div> 
                    <div className="idioma"> <h6>Idiomas</h6><br/>
                    {
                        idiomas.map(idioma =>{
                          return(
                            <Fragment>
                            <p><input type="checkbox" /><a>{idioma.name}</a></p>
                          </Fragment>
                          )
                        })
                      }
                    </div>
                    <div className="valoracion"><h6>Valoración</h6> <br/>
                    <input type={"checkbox"}></input><br/>
                    <input type={"checkbox"}></input><br/>
                    <input type={"checkbox"}></input><br/>
                    <input type={"checkbox"}></input><br/>
                    <input type={"checkbox"}></input>
                    </div>
                </DropdownMenu>
            </Dropdown>
        </div>

        <Outlet />
      </Fragment>
    );
};