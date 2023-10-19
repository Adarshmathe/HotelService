package com.hotelservice.service;

import java.util.List;

import com.hotelservice.util.Hotel;

public interface HotelService {
	
	Hotel createhotel(Hotel user);
	Hotel gethotel(long id);
	List<Hotel> getAllhotel();

}
