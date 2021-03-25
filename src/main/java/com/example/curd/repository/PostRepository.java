package com.example.curd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.curd.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {

}
