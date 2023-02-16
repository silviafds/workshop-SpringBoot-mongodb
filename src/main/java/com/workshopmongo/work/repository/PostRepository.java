package com.workshopmongo.work.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.workshopmongo.work.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

	
}
