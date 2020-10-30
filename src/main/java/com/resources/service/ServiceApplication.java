package com.resources.service;


import java.util.List;

import com.resources.domain.CreateStoryRequest;
import com.resources.model.Story;

public interface ServiceApplication {

	public List<Story> getStories();
	
	Story updateStory(CreateStoryRequest request, String id);

	Story findById(String id);
	
}
