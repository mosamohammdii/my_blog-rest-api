package com.example.mybolg2.payload;


import lombok.Data;

@Data
public class PostDto {

    private  int id;
    private String title;
    private String description;
    private String content;
}
