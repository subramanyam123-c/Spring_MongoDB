package com.JopPostings.mongoDB.Repository;

import com.JopPostings.mongoDB.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepo extends MongoRepository<Post,String> {
}
