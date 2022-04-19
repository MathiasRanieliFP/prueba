import React from "react";
import { Link } from "../link/link.component";
import "./dropdown.styles.css"


export const DropDown = props => {
    const { dropdown } = props; 
    return (
        <div className="dropdown-content">
            { dropdown.map(element => {

                return (
                    <Link link = { element } key={element.id} ></Link>
                )
            })}
        </div>
    )
} 