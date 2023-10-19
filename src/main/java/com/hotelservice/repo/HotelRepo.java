package com.hotelservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotelservice.util.Hotel;

public interface HotelRepo extends JpaRepository<Hotel, Long>{

}
