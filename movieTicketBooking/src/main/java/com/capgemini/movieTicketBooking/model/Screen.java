//package com.capgemini.movieTicketBooking.model;
//
//import java.util.List;
//
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//
//@Entity
//public class Screen {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int screenId;
//	
//	private  int theatreId;
//	private  String screenName;
//	@OneToMany(targetEntity=Show.class, mappedBy="Screen", fetch=FetchType.EAGER)
//	private  List<Show> showList;
//	
//	private  int rows;
//	private  int columns;
//	
//	public Screen() {}
//	
//	public Screen(int screenId, int theatreId, String screenName, List<Show> showList, int rows, int columns) {
//		super();
//		this.screenId = screenId;
//		this.theatreId = theatreId;
//		this.screenName = screenName;
//		this.showList = showList;
//		this.rows = rows;
//		this.columns = columns;
//	}
//
//	public int getScreenId() {
//		return screenId;
//	}
//
//	public void setScreenId(int screenId) {
//		this.screenId = screenId;
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
//	public String getScreenName() {
//		return screenName;
//	}
//
//	public void setScreenName(String screenName) {
//		this.screenName = screenName;
//	}
//
//	public List<Show> getShowList() {
//		return showList;
//	}
//
//	public void setShowList(List<Show> showList) {
//		this.showList = showList;
//	}
//
//	public int getRows() {
//		return rows;
//	}
//
//	public void setRows(int rows) {
//		this.rows = rows;
//	}
//
//	public int getColumns() {
//		return columns;
//	}
//
//	public void setColumns(int columns) {
//		this.columns = columns;
//	}
//	
//	
//	
//}
