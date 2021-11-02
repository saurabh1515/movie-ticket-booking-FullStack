import React, { Component } from 'react'
import MovieService from '../../services/MovieService';

class CreateMovieComponent extends Component {
    constructor(props) {
        super(props)

        this.state = {
            // step 2
            id: this.props.match.params.id, 
            movieName: '',
            movieGenre: '',
            movieHours: '',
            language: '',
            description: ''
        }
        this.changeMovieNameHandler = this.changeMovieNameHandler.bind(this);
        this.changeMovieGenreHandler = this.changeMovieGenreHandler.bind(this);
        this.changeMovieHoursHandler = this.changeMovieHoursHandler.bind(this);
        this.changeLanguageHandler = this.changeLanguageHandler.bind(this);
        this.changeDescriptionHandler = this.changeDescriptionHandler.bind(this);

        this.saveOrUpdateMovie = this.saveOrUpdateMovie.bind(this);
    }

    componentDidMount(){

        if(this.state.id === '_add'){
            return
        }else{
            MovieService.getMovieById(this.state.id).then( (res) =>{
                let movie = res.data;
                this.setState({movieName: movie.movieName,
                  movieGenre: movie.movieGenre,
                  movieHours : movie.movieHours,
                  language: movie.language,
                  description: movie.description
                });
            });
        }        
    }

    saveOrUpdateMovie = (e) => {
        e.preventDefault();
        let movie = {movieName: this.state.movieName, movieGenre: this.state.movieGenre, movieHours: this.state.movieHours, language: this.state.language, description:this.state.description};
        console.log('movie => ' + JSON.stringify(movie));

        // step 5
        if(this.state.id === '_add'){
            MovieService.createMovie(movie).then(res =>{
                this.props.history.push('/movies');
            });
        }else{
            movie.movieId = this.state.id;
            MovieService.updateMovie(movie).then( res => {
                this.props.history.push('/movies');
            });
        }
    }
    
    changeMovieNameHandler= (event) => {
        this.setState({movieName: event.target.value});
    }

    changeMovieGenreHandler= (event) => {
        this.setState({movieGenre: event.target.value});
    }

    changeMovieHoursHandler= (event) => {
        this.setState({movieHours: event.target.value});
    }

    changeLanguageHandler= (event) => {
      this.setState({language: event.target.value});
    }

    changeDescriptionHandler= (event) => {
    this.setState({description: event.target.value});
  }

    cancel(){
        this.props.history.push('/movies');
    }

    getTitle(){
        if(this.state.id === '_add'){
            return <h3 className="text-center">Add Movie</h3>
        }else{
            return <h3 className="text-center">Update Movie</h3>
        }
    }
    render() {
        return (
            <div>
    
                   <div className = "container">
                        <div className = "row">
                            <div className = "card col-md-6 offset-md-3 offset-md-3">
                                {
                                    this.getTitle()
                                }
                                <div className = "card-body">
                                    <form>
                                        <div className = "form-group">
                                            {/* <label> Movie Name: </label> */}
                                            <input placeholder="Movie Name" name="movieName" className="form-control" 
                                                value={this.state.movieName} onChange={this.changeMovieNameHandler}/>
                                        </div>
                                        <div className = "form-group">
                                            {/* <label> Movie Genre: </label> */}
                                            <input placeholder="Movie Genre" name="movieGenre" className="form-control" 
                                                value={this.state.movieGenre} onChange={this.changeMovieGenreHandler}/>
                                        </div>
                                        <div className = "form-group">
                                            {/* <label> Movie Hours: </label> */}
                                            <input placeholder="Movie Hours" name="movieHours" className="form-control" 
                                                value={this.state.movieHours} onChange={this.changeMovieHoursHandler}/>
                                        </div>
                                        <div className = "form-group">
                                            {/* <label> Language: </label> */}
                                            <input placeholder="Language" name="language" className="form-control" 
                                                value={this.state.language} onChange={this.changeLanguageHandler}/>
                                        </div>
                                        <div className = "form-group">
                                            {/* <label> Description: </label> */}
                                            <input placeholder="Description" name="description" className="form-control" 
                                                value={this.state.description} onChange={this.changeDescriptionHandler}/>
                                        </div>

                                        <button className="btn btn-success" onClick={this.saveOrUpdateMovie}>Save</button>
                                        <button className="btn btn-danger" onClick={this.cancel.bind(this)} style={{marginLeft: "10px"}}>Cancel</button>
                                    </form>
                                </div>
                            </div>
                        </div> 

                   </div>
            </div>
        )
    }
}
 
export default CreateMovieComponent
