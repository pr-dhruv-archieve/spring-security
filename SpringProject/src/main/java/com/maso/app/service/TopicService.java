package com.maso.app.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.maso.app.model.Topic;

@Service
public class TopicService {

	// Hard coded topics details
	private static List<Topic> list = Arrays.asList(new Topic("1", "Java", "Java is programming laguage"),
			new Topic("2", "Struts", "Struts is a Java Framework to develope web application"),
			new Topic("3", "Spring", "Spring is also a Java framework to develope web-app, cloud app etc"),
			new Topic("4", "Spring Boot", "Sring Boot provide automation to spring application"));

	public List<Topic> getAllTopics() {
		return list;
	}

	public Topic getTopic(String id) {
		return list.stream().filter(topic -> topic.getId().equals(id) ).findFirst().get();
	}
	
}
