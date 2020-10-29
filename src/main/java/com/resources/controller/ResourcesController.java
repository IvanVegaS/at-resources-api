package com.resources.controller;

import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import com.resources.model.PutOperationResponse;
import com.resources.model.Story;

@RestController
public class ResourcesController {
	RestTemplate restTemplate;
	
	@PutMapping (value = "/api/v1/story/{id}", produces = "application/json")
	@ResponseStatus (value = HttpStatus.OK )
	public PutOperationResponse updateStory(@RequestBody Story storyToUpdate) {
		PutOperationResponse putOperationResponse =  new PutOperationResponse();

		return putOperationResponse;
	}

}