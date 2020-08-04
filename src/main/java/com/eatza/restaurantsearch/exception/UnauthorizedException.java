package com.eatza.restaurantsearch.exception;

@SuppressWarnings("serial")
public class UnauthorizedException extends Exception {
	
	
	public UnauthorizedException() {
		super();
	}
	
	public UnauthorizedException(String msg) {
		super(msg);
	}

}
