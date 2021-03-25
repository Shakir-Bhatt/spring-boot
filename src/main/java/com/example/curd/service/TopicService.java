package com.example.curd.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.curd.model.Topic;
/*
 * Service annotation will tell spring it is a business class 
 * Service is a singleton 
 */

@Service 
public class TopicService {

	/*
	 *  As Arrays.asList is immutable, we have to make mutable to add new topics
	 *  new ArrayList<>(); will make it mutable
	 */
	
	public List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("java","Spring boot","learing spring boot"),
			new Topic("php","laravel ","learing laravel")
		));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopicById( String id){
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}

	public String add(Topic topic) {
		topics.add(topic);
		return "topic added";
	}
	
	public Boolean update(Topic topic, String id) {
		// Two ways
		
		// First 
		for(int i=0; i< topics.size(); i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return true;
			}
		}
		
		
		// Second
		
		Topic x= topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		x.setId(topic.getId());
		x.setName(topic.getName());
		x.setDescription(topic.getDescription());
		return true;
	}

	public String delete(String id) {
		topics.removeIf(t->t.getId().equals(id));
		return "Removed";
	}
}
