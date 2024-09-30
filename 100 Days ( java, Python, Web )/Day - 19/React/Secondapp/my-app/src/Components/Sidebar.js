import React from "react";

function Sidebar(props) {
    return (  
        <>
            <h1 className="h1-slidebar">{props.greet} from Sidebar</h1>
        </>
    );
}

export default Sidebar;