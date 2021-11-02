//package com.capgemini.movieTicketBooking.model;
//
//import java.util.List;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//@Entity
//public class Theatre {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int theatreId;
//	
//	private String theatreName;
//	private String theatreCity;
//	private List<Movie> listOfMovies;
//	private List<Screen> listOfScreens;
//	private String managerName;
//	private String managerContact;
//	
//	public Theatre() {}
//	
//	public Theatre(int theatreId, String theatreName, String theatreCity, List<Movie> listOfMovies,
//			List<Screen> listOfScreens, String managerName, String managerContact) {
//		super();
//		this.theatreId = theatreId;
//		this.theatreName = theatreName;
//		this.theatreCity = theatreCity;
//		this.listOfMovies = listOfMovies;
//		this.listOfScreens = listOfScreens;
//		this.managerName = managerName;
//		this.managerContact = managerContact;
//	}
//
//	public int getTheatreId() {
//		return theatreId;
//	}
//
//	public void setTheatreId(int theatreId) {
//		this.theatreId = theatreId;
//	}
//
//	public String getTheatreName() {
//		return theatreName;
//	}
//
//	public void setTheatreName(String theatreName) {
//		this.theatreName = theatreName;
//	}
//
//	public String getTheatreCity() {
//		return theatreCity;
//	}
//
//	public void setTheatreCity(String theatreCity) {
//		this.theatreCity = theatreCity;
//	}
//
//	public List<Movie> getListOfMovies() {
//		return listOfMovies;
//	}
//
//	public void setListOfMovies(List<Movie> listOfMovies) {
//		this.listOfMovies = listOfMovies;
//	}
//
//	public List<Screen> getListOfScreens() {
//		return listOfScreens;
//	}
//
//	public void setListOfScreens(List<Screen> listOfScreens) {
//		this.listOfScreens = listOfScreens;
//	}
//
//	public String getManagerName() {
//		return managerName;
//	}
//
//	public void setManagerName(String managerName) {
//		this.managerName = managerName;
//	}
//
//	public String getManagerContact() {
//		return managerContact;
//	}
//
//	public void setManagerContact(String managerContact) {
//		this.managerContact = managerContact;
//	}
//	
//	
//	
//}
