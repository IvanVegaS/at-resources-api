package com.resources.errorhandling;

import org.springframework.http.HttpStatus;

public class TypeError {
	static HttpStatus newTypeError = HttpStatus.BAD_REQUEST;
	static int httpError;
	static String httpNameError;
	static String message;
	static String path;
	
	public static void httpErrorMessage(HttpStatus typeError, Exception error, String messageParameter, String pathParameter) {
	
		newTypeError = typeError;
		httpError = typeError.value();
		httpNameError = typeError.name();
		message = messageParameter;
		path = pathParameter;
		
	}
	
}