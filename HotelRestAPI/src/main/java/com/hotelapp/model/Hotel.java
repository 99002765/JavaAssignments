package com.hotelapp.model;

public class Hotel {
	Integer hotelId;
	String hotelName,city,type,cuisine;
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hotel(Integer hotelId, String hotelName, String city, String type, String cuisine) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.city = city;
		this.type = type;
		this.cuisine = cuisine;
	}
	public Integer getHotelId() {
		return hotelId;
	}
	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCuisine() {
		return cuisine;
	}
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", city=" + city + ", type=" + type
				+ ", cuisine=" + cuisine + "]";
	}
	
}
