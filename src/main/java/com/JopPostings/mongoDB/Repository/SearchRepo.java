package com.JopPostings.mongoDB.Repository;

import com.JopPostings.mongoDB.model.Post;

import java.util.List;

public interface SearchRepo {
    public List<Post> findByText(String text);
}
