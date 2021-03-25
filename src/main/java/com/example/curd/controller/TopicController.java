package com.example.curd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.curd.model.Topic;
import com.example.curd.service.TopicService;

@RestController
public class TopicController {

	// Register a Service 
	@Autowired
	TopicService topicService;
	
	@GetMapping("/api/v1/topics")
	public List<Topic> topics(){
		return topicService.getAllTopics();
	}
	
	@GetMapping("/api/v1/topics/{id}")
	public Topic topicById(@PathVariable String id){
		return topicService.getTopicById(id);
	}
	
	@PostMapping("/api/v1/topics")
	public String addTopic(@RequestBody Topic topic){
		return topicService.add(topic);
	}
	
	@PutMapping("/api/v1/topics/{id}")
	public String updateTopic(@RequestBody Topic topic,@PathVariable String id){
		if(topicService.update(topic, id)) {
			return "topic updated";
		}
		return "Error";
	}
	
	@DeleteMapping("/api/v1/topics/{id}")
	public String deleteTopic(@PathVariable String id){
		return topicService.delete(id);
	}
}
