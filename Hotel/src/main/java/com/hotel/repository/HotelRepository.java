package com.hotel.repository;
import org.springframework.data.repository.CrudRepository;

import com.hotel.model.Hotel;
public interface HotelRepository extends CrudRepository<Hotel, Integer>
{
}
