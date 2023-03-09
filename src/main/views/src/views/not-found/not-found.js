import React from 'react';
import { Link } from "react-router-dom";
/* assets */
import Lost from './assets/images/On the way-pana.png'

function NotFound(props) {
    return (
        <div className={"not-found"}>
            <img src={Lost} alt="lost_man" className={"lost_man"}/>
            <div className="not-found-content">
                <h1>Erreur 404</h1>
                <h2>Page introuvable</h2>
                <p>Il se peut que vous avez pris la mauvaise route, s'il vous plait, <Link to={"/"}>rebroussez chemin</Link>
                </p>
            </div>
        </div>
    );
}

export default NotFound;