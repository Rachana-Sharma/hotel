package com.hotel.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.model.Hotel;
import com.hotel.repository.HotelRepository;

@Service
public class HotelService 
{
@Autowired
HotelRepository hotelRepository;

public List<Hotel> getAllHotel() 
{
List<Hotel> hotelList = new ArrayList<Hotel>();
hotelRepository.findAll().forEach(hotel -> hotelList.add(hotel));
return hotelList;
}

public Hotel getHotelById(int id) 
{
return hotelRepository.findById(id).get();
}
public void saveHotel(Hotel hotel) 
{
hotelRepository.save(hotel);
}

public void deleteHotel(int id) 
{
hotelRepository.deleteById(id);
}
}