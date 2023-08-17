package com.example.mybolg2.servies.impl;

import com.example.mybolg2.entity.Post;
import com.example.mybolg2.payload.PostDto;
import com.example.mybolg2.repository.PostRepository;
import com.example.mybolg2.servies.PostServises;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServicesImpl implements PostServises {

    @Autowired
    public PostServicesImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    PostRepository postRepository;


    @Override
    public PostDto createPost(PostDto postDto) {

        Post postDat =  this.postRepository.save(mapToEntity(postDto));

        return mapTodTo(postDat);

    }

    @Override
    public List<PostDto> getAllPost() {
     List<Post> post  =   this.postRepository.findAll();


     return post.stream().map(post1 -> mapTodTo(post1) ).collect(Collectors.toList());

    }


    //convert  dto to entity

    private Post mapToEntity(PostDto postDto){
        Post post = new Post();


        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());


        return  post;


    }



    //convert entity to dto

    public PostDto mapTodTo(Post post){
        PostDto postDto = new PostDto();

        postDto.setId(post.getId());
        postDto.setTitle(post.getTitle());
        postDto.setDescription(post.getDescription());
        postDto.setContent(post.getContent());

        return  postDto;

    }
}
