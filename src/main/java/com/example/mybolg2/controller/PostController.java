package com.example.mybolg2.controller;


import com.example.mybolg2.payload.PostDto;
import com.example.mybolg2.servies.PostServises;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("api/posts")
public class PostController {

    PostServises postServises;

    public PostController(PostServises postServises) {
        this.postServises = postServises;
    }

    @PostMapping
    public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto){
      return new ResponseEntity<>(this.postServises.createPost(postDto) , HttpStatus.CREATED);
    }


    @GetMapping("get")
    public ResponseEntity<List<PostDto>> getAllPost(){
        return new ResponseEntity<>(this.postServises.getAllPost(),HttpStatus.CREATED);
    }
}
