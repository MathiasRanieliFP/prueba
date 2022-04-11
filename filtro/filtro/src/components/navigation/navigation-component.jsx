import { Fragment, useState } from "react";
import { Outlet } from "react-router-dom";

import "bootstrap/dist/css/bootstrap.min.css";
import { Dropdown, DropdownItem, DropdownMenu, DropdownToggle } from "reactstrap";

import "./navigation-style.css"


function Navigation() {
    const [dropdown, setDropdown] = useState(false);
    
    const abrirCerrarDropdown = () =>{
        setDropdown(!dropdown);
    }
    
    return (
      <Fragment>
        <div className='navigation'>
            <Dropdown isOpen={dropdown} toggle = {abrirCerrarDropdown} className= "dropdown">
                <DropdownToggle className="btn-dropdown" caret>Filtrar por... </DropdownToggle>
                <DropdownMenu>

                </DropdownMenu>
            </Dropdown>
        </div>

        <Outlet />
      </Fragment>
    );
};

export default Navigation