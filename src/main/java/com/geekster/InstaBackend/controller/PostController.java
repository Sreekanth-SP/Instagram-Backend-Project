package com.geekster.InstaBackend.controller;

import com.geekster.InstaBackend.model.Post;
import com.geekster.InstaBackend.service.AuthenticationService;
import com.geekster.InstaBackend.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@Validated
@RestController
public class PostController {
    @Autowired
    PostService postService;
    @Autowired
    AuthenticationService authenticationService;

    @PostMapping("post")
    public String createInstaPost(@RequestBody Post post, @RequestParam String email, @RequestParam String token)
    {
        if(authenticationService.authenticate(email,token)) {
            return postService.createInstaPost(post,email);
        }
        else {
            return "Not an Authenticated user activity!!!";
        }
    }
    @GetMapping("post/id/{id}")
    public Post getPostById(Integer id) {
        return postService.getPostById(id);
    }
}
