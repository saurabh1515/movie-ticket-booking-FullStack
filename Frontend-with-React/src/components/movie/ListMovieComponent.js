import React, { Component } from 'react'
import MovieService from '../../services/MovieService';

class ListMovieComponent extends Component {
    constructor(props) {
        super(props)

        this.state = {
          movies: []
        }
        this.addMovie = this.addMovie.bind(this);
        this.editMovie = this.editMovie.bind(this);
        this.deleteMovie = this.deleteMovie.bind(this);
    }

    deleteMovie(id){
        MovieService.deleteMovie(id).then( res => {
            this.setState({movies: this.state.movies.filter(movie => movie.movieId !== id)});
        });
       
    }

    viewMovie(id){
        this.props.history.push(`/view-movie/${id}`);
    }

    editMovie(id){
        this.props.history.push(`/add-movie/${id}`);
    }

    componentDidMount(){
        MovieService.getMovies().then((res) => {
            this.setState({ movies: res.data});
        });
    }

    addMovie(){
        this.props.history.push('/add-movie/_add');
    }

    render() {
        return (
            <div className="container" style={{marginBottom: "100px"}}>
                <div className = "row">
                 <h2 className="text-center">Movies List</h2>
                    <button style={{width: "20%"}}  className="btn btn-primary" onClick={this.addMovie}> Add Movie</button>
                 </div>
                 <br></br>
                 <div className = "row">
                        {
                            this.state.movies.map(
                                movie => 

                                <div class="card" style={{width: "25rem", margin:"20px  20px"}}>
                                    <div class="card-body" key = {movie.movieId}>
                                        <h4 class="card-title"> { movie.movieName}</h4>
                                        <h6 class="card-subtitle mb-2 text-muted">{movie.movieGenre}</h6>
                                        <p class="card-text">{movie.description}</p>

                                        <button onClick={ () => this.editMovie(movie.movieId)} className="btn btn-success">Update </button>
                                        <button style={{marginLeft: "10px"}} onClick={ () => this.deleteMovie(movie.movieId)} className="btn btn-danger">Delete </button>
                                        <button style={{marginLeft: "10px"}} onClick={ () => this.viewMovie(movie.movieId)} className="btn btn-info">View </button>
                                    </div>
                                </div>
                            )
                        }
                       

                 </div>

            </div>
        )
    }
}

export default ListMovieComponent;
