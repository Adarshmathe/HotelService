package com.hotelservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotelservice.service.HotelService;
import com.hotelservice.util.Hotel;

@RestController
@RequestMapping("/hotel")
public class HotelController {
	
	@Autowired
	private HotelService hotelservice;
	
	@PreAuthorize("hasAuthority('Admin')")
	@PostMapping("/create")
	public ResponseEntity<Hotel> createuser(@RequestBody Hotel hotel){
		
		Hotel createuser = hotelservice.createhotel(hotel);
		
		return new ResponseEntity<Hotel>(createuser,HttpStatus.OK);
	}
	
	@PreAuthorize("hasAuthority('SCOPE_internal')")
	@GetMapping("/{id}")
	public ResponseEntity<Hotel> getuser(@PathVariable long id ){
		
		Hotel user1 = hotelservice.gethotel(id);
		
		return new ResponseEntity<Hotel>(user1,HttpStatus.OK);
	}
	
	@PreAuthorize("hasAuthority('SCOPE_internal') || hasAuthority('Admin')")
	@GetMapping("/all")
	public ResponseEntity<List<Hotel>> getAllhotel(){
		
		List<Hotel> allUser = hotelservice.getAllhotel();
		
		
		return new ResponseEntity<List<Hotel>>(allUser,HttpStatus.OK);
	}
	

}
