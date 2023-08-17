package com.example.mybolg2.servies;

import com.example.mybolg2.payload.PostDto;

import java.util.List;

public interface PostServises {

    PostDto createPost(PostDto postDto);
    List<PostDto> getAllPost();
}
