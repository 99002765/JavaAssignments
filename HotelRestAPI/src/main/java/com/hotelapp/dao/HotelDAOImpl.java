package com.hotelapp.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hotelapp.model.Hotel;
@Service
public class HotelDAOImpl implements HotelDAO {

	@Override
	public List<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		return showAllHotels();
	}

	@Override
	public Hotel getById(int id) {
		// TODO Auto-generated method stub
		for(Hotel hotel: getAllHotels()) {
			if(hotel.getHotelId().equals(id)) {
				return hotel;
			}
		}
		return null;
	}

	@Override
	public List<Hotel> getByCity(String city) {
		// TODO Auto-generated method stub
		List<Hotel> newHotelList= new ArrayList<>();
		for(Hotel hotel: getAllHotels()) {
			if(hotel.getCity().equals(city)) {
				newHotelList.add(hotel);
			}
		}
		return newHotelList;
	}

	@Override
	public List<Hotel> getByCuisine(String cuisine) {
		// TODO Auto-generated method stub
		List<Hotel> newHotelList= new ArrayList<>();
		for(Hotel hotel: getAllHotels()) {
			if(hotel.getCuisine().equals(cuisine)) {
				newHotelList.add(hotel);
			}
		}
		return newHotelList;
	}
	private List<Hotel> showAllHotels() {
		return Arrays.asList(
				new Hotel(1,"Santosh Dhaba","Hyderabad","Veg","Indian"),
				new Hotel(2,"Kalyani","Mysore","Non-Veg","Indian"),
				new Hotel(3,"Dominos","Hyderabad","Non-Veg","American")
				);
	}
}
