import React from 'react'
import ReactDOM from 'react-dom/client'
import App from './App.jsx'
import {createBrowserRouter, RouterProvider} from "react-router-dom";
import Login from "./application/Login/index.jsx";
import Home from "./application/Home/index.jsx";
import SignUp from "./application/SignUp/index.jsx"

const routers = createBrowserRouter(
    [
        {
            path: "/",
            element: <App />,
        },
        {
            path: "/login",
            element: <Login />
        },
        {
            path: "/home",
            element: <Home />
        },
        {
            path: "/sign-up",
            element: <SignUp />
        },
    ]
)

ReactDOM.createRoot(document.getElementById('root')).render(
    <React.StrictMode>
        <RouterProvider router={routers} />
    </React.StrictMode>,
)
