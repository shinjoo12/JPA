package com.ohgiraffers.blog.jaesuk.controller;

import com.ohgiraffers.blog.jaesuk.model.dto.BlogDTO;
import com.ohgiraffers.blog.jaesuk.model.entity.JooyeonBlog;
import com.ohgiraffers.blog.jaesuk.service.JooyeonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/jaesuk")
public class jaesukController {

    private final JooyeonService jooyeonService;

    @Autowired
    public jaesukController(JooyeonService jooyeonService){
        this.jooyeonService = jooyeonService;
    }

    @GetMapping
    public String indexJaesuk(){
        return "/jaesuk/index";

    }

    @PostMapping
    public ModelAndView postBlog(BlogDTO blogDTO, ModelAndView mv){
        System.out.println(blogDTO.getBlogTitle()==null || blogDTO.getBlogTitle().equals(""));
        if(blogDTO.getBlogTitle()== null || blogDTO.getBlogTitle().equals("")){
            mv.setViewName("redirect:/jaesuk");

        }
        if(blogDTO.getBlogContent() == null || blogDTO.getBlogContent().equals("")){
            mv.setViewName("redirect:/jaesuk");
        }
        int result = jooyeonService.post(blogDTO);
        mv.setViewName("/jaesuk/jaesuk");
        return null;

    }

}
