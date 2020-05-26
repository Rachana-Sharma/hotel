package com.hotel.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.model.Hotel;
import com.hotel.service.HotelService;

/**
 * @author Rachana Sharma
 * Hotel Controller
 */
@RestController
public class HotelController {

	@Autowired
	HotelService hotelService;
 
	/**
	 * @return List of all hotel 
	 */
	@GetMapping("/hotel/get")
	private List<Hotel> getAllHotel() {
		return hotelService.getAllHotel();
	}
	/**
	 * @param id
	 * @return saved details against given id
	 */
	@GetMapping("/hotel/{id}")
	private Hotel getHotel(@PathVariable("id") int id) {
		return hotelService.getHotelById(id);
	}
	/**
	 * @param id
	 * delete from repository against given id
	 */
	@DeleteMapping("/hotel/delete/{id}")
	private void deleteHotels(@PathVariable("id") int id) {
		hotelService.deleteHotel(id);
	}
	/**
	 * @param hotel
	 * @return id of hotel that has been saved to repository
	 */
	@PostMapping("/hotel/save")
	private int saveHotel(@RequestBody Hotel hotel) {
		hotelService.saveHotel(hotel);
		return hotel.getId();
	}
}
