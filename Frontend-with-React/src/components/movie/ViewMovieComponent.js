import React, { Component } from 'react'
import MovieService from '../../services/MovieService';

class ViewMovieComponent extends Component {
    constructor(props) {
        super(props)

        this.state = {
            id: this.props.match.params.id,
            movie: {}
        }
    }

    componentDidMount(){
        MovieService.getMovieById(this.state.id).then( res => {
            this.setState({movie: res.data});
        })
    }
    cancel() {
        this.props.history.push('/movies');
    }
    render() {
        return (
            <div  style={{marginBottom: "100px"}}>
        
                <div className = "card col-md-6 offset-md-3">
                    <h3 className = "text-center">  { this.state.movie.movieName }</h3>
                    <div className = "card-body">
        
                        <table class="table table-borderless">
                        <thead>
                            <tr>
                            <th scope="col"></th>
                            <th scope="col"></th>
                            </tr>
                        </thead>
                        <tbody>
                            {/* <tr>
                                <th scope="row">Movie Name:</th>
                                <td>{ this.state.movie.movieName }</td>
                                
                            </tr> */}
                            <tr>
                                <th scope="row">Movie Genre:  </th>
                                <td> { this.state.movie.movieGenre }</td>
                                
                            </tr>
                            <tr>
                                <th scope="row">Movie Hours:</th>
                                <td>{ this.state.movie.movieHours }</td>
                                
                            </tr>
                            <tr>
                                <th scope="row">Language:</th>
                                <td>{ this.state.movie.language }</td>
                                
                            </tr>
                            <tr>
                                <th scope="row">Description:</th>
                                <td>{ this.state.movie.description }</td>
                                
                            </tr>
                            
                        </tbody>
                    </table>
                    </div>
                    <button  className="btn btn-danger" onClick={this.cancel.bind(this)} style={{margin: "10px 200px"}}>Back</button>
                </div>
            </div>
        )
    }
}

export default ViewMovieComponent
