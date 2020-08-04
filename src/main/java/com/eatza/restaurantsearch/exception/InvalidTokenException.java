package com.eatza.restaurantsearch.exception;

@SuppressWarnings("serial")
public class InvalidTokenException extends RuntimeException {
	
	public InvalidTokenException() {
		super();
	}
	public InvalidTokenException(String msg) {
		super(msg);
	}

}
