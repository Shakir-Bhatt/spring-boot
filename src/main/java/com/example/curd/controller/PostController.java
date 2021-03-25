package com.example.curd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.curd.model.Post;
import com.example.curd.repository.PostRepository;

@RestController 
public class PostController {
	@Autowired
	private PostRepository postRepository;
//
//	@PostMapping("api/rs/add")
//	public ResponseEntity<Void> acceptOrder(@RequestBody Post post) {
//		
//		Post postObj = new Post(); // this table schema
//		postObj.setName(post.getName());
//
//		orderRepository.save(postObj);
//		return new ResponseEntity<>(HttpStatus.ACCEPTED);
//	}
//	
//	@GetMapping("/api/rs/list")
//	List<Post> all() {
//	    return orderRepository.findAll();
//	}
	
	@GetMapping("/posts")
	public List<Post> getPostList() {
		
		return postRepository.findAll();
	}
	
}
