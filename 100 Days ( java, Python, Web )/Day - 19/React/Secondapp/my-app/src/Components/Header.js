import React from "react";

function Header(props) {
    console.log(props);
    return (  
        <>
            <h1 className="h1-header">Hello there indeed, {props.name}, {props.color}</h1>
        </>
    );
}

export default Header;