package com.example.mybolg2.repository;

import com.example.mybolg2.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
