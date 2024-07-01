package com.ohgiraffers.blog.jaesuk.repository;

import com.ohgiraffers.blog.jaesuk.model.entity.JooyeonBlog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JooyeonRepository extends JpaRepository<JooyeonBlog, Integer> {

}
