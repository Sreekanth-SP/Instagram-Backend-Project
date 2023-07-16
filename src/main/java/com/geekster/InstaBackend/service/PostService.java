package com.geekster.InstaBackend.service;


import com.geekster.InstaBackend.model.Post;
import com.geekster.InstaBackend.model.User;
import com.geekster.InstaBackend.repository.IPostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PostService {

    @Autowired
    IPostRepo postRepo;

    public String createInstaPost(Post post,String email) {
        post.setPostCreatedTimeStamp(LocalDateTime.now());
        postRepo.save(post);
        return "Post uploaded!!!!";
    }
    public Post getPostById(Integer id) {

        return postRepo.findById(id).orElse(null);
    }

}
