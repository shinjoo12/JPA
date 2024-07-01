package com.ohgiraffers.blog.jaesuk.service;

import com.ohgiraffers.blog.jaesuk.model.dto.BlogDTO;
import com.ohgiraffers.blog.jaesuk.model.entity.JooyeonBlog;
import com.ohgiraffers.blog.jaesuk.repository.JooyeonRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class JooyeonService {

    private final JooyeonRepository jooyeonRepository;


    @Autowired
    public JooyeonService(JooyeonRepository jooyeonRepository) {
        this.jooyeonRepository = jooyeonRepository;
    }

    @Transactional
    public int post(BlogDTO blogDTO) {
        List<JooyeonBlog> jaesukBlogs = jooyeonRepository.findAll();
        // 도메인 로직
        for (JooyeonBlog blog: jaesukBlogs) {
            if(blog.getBlogTitle().equals(blogDTO.getBlogTitle())){
                return 0;
            }


        }
        JooyeonBlog saveBlog = new JooyeonBlog();
        saveBlog.setBlogContent(blogDTO.getBlogTitle());
        saveBlog.setCreateDate(new Date());
        JooyeonBlog result = jooyeonRepository.save(saveBlog);

        int resultValue = 0;

        if(result != null){
            resultValue = 1;

        }
        return resultValue;

    }

}
