package com.hotelservice.util;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class customException extends RuntimeException{
	
	private String ecode;
	private String emessage;
	
	
	public customException(String ecode, String emessage) {
		super(emessage);
		this.ecode = ecode;
		this.emessage = emessage;
	}


	

}
