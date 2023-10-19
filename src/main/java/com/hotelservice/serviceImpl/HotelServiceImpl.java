package com.hotelservice.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelservice.repo.HotelRepo;
import com.hotelservice.service.HotelService;
import com.hotelservice.util.Hotel;
import com.hotelservice.util.customException;


@Service
public class HotelServiceImpl implements HotelService{
	
	@Autowired
	private HotelRepo hotelrepo;

	@Override
	public Hotel createhotel(Hotel hotel) {
		
		return hotelrepo.save(hotel);
	}

	@Override
	public Hotel gethotel(long id) {
		
		return hotelrepo.findById(id).orElseThrow(()->new customException("601","Not found..!!"));
	}

	@Override
	public List<Hotel> getAllhotel() {
		// TODO Auto-generated method stub
		return hotelrepo.findAll();
	}

}
