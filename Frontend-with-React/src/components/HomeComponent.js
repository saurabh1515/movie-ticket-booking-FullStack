import React, {Component} from 'react';



class HomeComponent extends Component{
  constructor(props){
    super(props)
  }

  toMovies() {
    this.props.history.push('/movies');
  }
  
  toCustomers() {
    this.props.history.push('/customers');
  }

  render(){
      return (
        <div >
          <button  className="btn btn-lg btn-danger" onClick={this.toCustomers.bind(this)} style={{position:"absolute", margin: "400px  500px"}}>Customers
          </button>

          <button  className="btn btn-lg btn-danger" onClick={this.toMovies.bind(this)} style={{position:"absolute", margin: "400px", marginLeft:"700px"}}>Movies</button>
          <img className="home-img" src= "https://images.unsplash.com/photo-1489599849927-2ee91cede3ba?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8dGhlYXRlcnxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&w=1000&q=80"  />

          
        </div>

      )
    }
}


export default HomeComponent;