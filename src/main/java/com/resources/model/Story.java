package com.resources.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.Data;

@Document(collection = "stories") 
@Data
public class Story {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Integer id;
	
	private Integer sprint_id;
	
	private Integer user_id;
	
	private Integer priority;
	
	private String name;
	
	private String description;
	
	private String aceptance_criteria;
	
	private Integer story_points;
	
	private Integer progress;
	
	private Integer start_date;
	
	private Integer due_date;
	
	private Integer create_date;
	
	private Integer status;
	

}