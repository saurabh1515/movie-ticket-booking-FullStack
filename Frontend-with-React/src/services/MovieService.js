import axios from 'axios';

const MOVIE_URL = "http://localhost:8080/movies";

class MovieService {

    getMovies(){
        return axios.get(MOVIE_URL);
    }

    createMovie(movie){
        return axios.post(MOVIE_URL, movie);
    }

    getMovieById(movieId){
        return axios.get(MOVIE_URL + '/' + movieId);
    }

    updateMovie(movie){
        return axios.put(MOVIE_URL , movie);
    }

    deleteMovie(movieId){
        return axios.delete(MOVIE_URL + '/' + movieId);
    }
}

export default new MovieService()