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
public class HotelController 
{

@Autowired
HotelService hotelService;
 
@GetMapping("/hotel/get")
private List<Hotel> getAllHotel() 
{
return hotelService.getAllHotel();
}

@GetMapping("/hotel/{id}")
private Hotel getHotel(@PathVariable("id") int id) 
{
return hotelService.getHotelById(id);
}

@DeleteMapping("/hotel/delete/{id}")
private void deleteHotels(@PathVariable("id") int id) 
{
hotelService.deleteHotel(id);
}

@PostMapping("/hotel/save")
private int saveHotel(@RequestBody Hotel hotel) 
{
hotelService.saveHotel(hotel);
return hotel.getId();
}
}
