package com.maso.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maso.app.model.Topic;
import com.maso.app.service.TopicService;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;

	/*
	 * Get all Topics and its details 
	 * GET /topics
	 */
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}

	/*
	 * Get particular Topic and its details. 
	 * GET /topics/id
	 */
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	/*
	 * Create new Topic.
	 * POST /topics
	 */

	/*
	 * Update a particular topic.
	 * PUT /topics/id
	 */

	/*
	 * Delete a particular topic. 
	 * DELETE /topics/id
	 */
}
