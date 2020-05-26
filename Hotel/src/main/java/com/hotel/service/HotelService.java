package com.hotel.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.model.Hotel;
import com.hotel.repository.HotelRepository;

/**
 * @author Rachana Sharma
 * Service Class: HotelService
 */
	@Service
	public class HotelService {
	@Autowired
	HotelRepository hotelRepository;
	
	/**
	 * @return hotelList
	 * to add new hotel to the ArrayList
	 */
	public List<Hotel> getAllHotel() {
		List<Hotel> hotelList = new ArrayList<Hotel>();
		hotelRepository.findAll().forEach(hotel -> hotelList.add(hotel));
		return hotelList;
	}
	/**
	 * @param id
	 * @return saved values from repository against the given id 
	 */
	public Hotel getHotelById(int id) {
		return hotelRepository.findById(id).get();
	}
	/**
	 * @param hotel
	 * to save into hotel repository
	 */
	public void saveHotel(Hotel hotel) {
		hotelRepository.save(hotel);
	}
	/**
	 * @param id
	 * to delete from repository against given id
	 */
	public void deleteHotel(int id) {
		hotelRepository.deleteById(id);
	}
}
