import React from 'react';
import './App.css';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom'

import ListMovieComponent from './components/movie/ListMovieComponent';
import HeaderComponent from './components/HeaderComponent';
import FooterComponent from './components/FooterComponent';
import CreateMovieComponent from './components/movie/CreateMovieComponent';
import ViewMovieComponent from './components/movie/ViewMovieComponent';

import ListCustomerComponent from './components/customer/ListCustomerComponent';
import CreateCustomerComponent from './components/customer/CreateCustomerComponent';
import ViewCustomerComponent from './components/customer/ViewCustomerComponent';
import HomeComponent from "./components/HomeComponent";

function App() {
  return (
    <div >
        <Router>
        <HeaderComponent />
       
        <div>
            <Switch>
            <Route path = "/" exact component = {HomeComponent}></Route>
              <Route path = "/movies" component = {ListMovieComponent}></Route>
              <Route path = "/add-movie/:id" component = {CreateMovieComponent}></Route>
              <Route path = "/view-movie/:id" component = {ViewMovieComponent}></Route>

              <Route path = "/customers" component = {ListCustomerComponent}></Route>
              <Route path = "/add-customer/:id" component = {CreateCustomerComponent}></Route>
              <Route path = "/view-customer/:id" component = {ViewCustomerComponent}></Route>
            </Switch>
        </div>
          <FooterComponent />     
        </Router>
    </div>
    
  );
}

export default App;
