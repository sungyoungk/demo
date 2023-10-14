package com.example.demo.controller;

import com.example.demo.domain.Post;
import com.example.demo.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class HomeController {
    
private final PostService postService;

@GetMapping("/")
    public String Home(Model model) {
        List<Post> posts = postService.findAll();
        model.addAttribute("posts", posts);
        return "/index";
    }
}
