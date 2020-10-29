package com.resources.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.resources.repository.RepositoryApplication;

@Service
public class ServiceApplicationImpl implements ServiceApplication {

	@Autowired
	RepositoryApplication repositoryApplication;
	
	
}

