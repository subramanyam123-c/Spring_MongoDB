package com.JopPostings.mongoDB.RestController;

import com.JopPostings.mongoDB.Repository.PostRepo;
import com.JopPostings.mongoDB.Repository.SearchRepo;
import com.JopPostings.mongoDB.model.Post;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;


@RestController
public class PostController {

    @Autowired
    PostRepo repo;

    @Autowired
    SearchRepo searchRepo;
    @Operation(hidden = true)
    @RequestMapping(value="/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }
    @GetMapping("/allPosts")
    public List<Post> getAll(){
        return repo.findAll();
    }

    @GetMapping("/post/{text}")
    public List<Post> getPostByText(@PathVariable String text){
        return searchRepo.findByText(text);
    }
    @PostMapping("/post")
    public Post post(@RequestBody Post jobpost){
        return repo.save(jobpost);
    }
}

