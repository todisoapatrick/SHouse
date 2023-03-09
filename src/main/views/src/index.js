import React, { lazy, Suspense} from 'react';
import ReactDOM from 'react-dom/client';
import reportWebVitals from './reportWebVitals';
import {BrowserRouter as Router, Routes, Route} from "react-router-dom";
/* Stylesheets */
import "./assets/sass-boilerplate/stylesheets/main.scss"
import "./assets/fontawesome/css/all.css"

/* Components */
const Loader = lazy(() => import("./components/loader/loader"));

/* Views */
const Landing = lazy(() => import("./views/landing/landing"));
const Login = lazy(() => import("./views/auth/log_in/login"));
const Signin = lazy(() => import("./views/auth/sign_in/signin"));
const MoreInfo = lazy(() => import("./views/app-wrapper/views/more-info/more-info"));
const MapTest = lazy(() => import("./views/app-wrapper/views/map-test/mapTest"));
const AdminDash = lazy(() => import("./views/app-wrapper/views/dashboards/admin/admin"));
const UserDash = lazy(() => import("./views/app-wrapper/views/dashboards/user/user"));
const NotFound = lazy(() => import("./views/not-found/not-found"));

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <Suspense fallback={<Loader/>}>
      <Router>
          <Routes>
              <Route path={"/"} index element={<Landing/>}/>
              <Route path={"/loader"} element={<Loader/>}/>
              <Route path={"/auth/login"} element={<Login/>}/>
              <Route path={"/auth/signin"} element={<Signin/>}/>
              <Route path={"/app/more-info"} element={<MoreInfo/>}/>
              <Route path={"/app/maptest"} element={<MapTest/>}/>
              <Route path={"/app/admin"} element={<AdminDash/>}/>
              <Route path={"/app/user"} element={<UserDash/>}/>
              <Route path={"*"} element={<NotFound/>}/>
          </Routes>
      </Router>
    </Suspense>
  </React.StrictMode>
);

reportWebVitals();
