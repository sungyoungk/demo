package com.example.demo.controller;

import com.example.demo.domain.Post;
import com.example.demo.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @GetMapping("/post")
    public String post() {
        System.out.println("post page");
        return "/post";
    }

    @GetMapping("/post/{articleId}")
    public Post getArticle(@PathVariable Long postId) {
        System.out.println("get article by articleId");
        postService.findById(postId);
        return null;
    }

    @PutMapping("/post/{articleId}")
    public void saveArticle(@PathVariable Long articleId) {
        System.out.println("save article");
       //  articleService.saveArticle(articleId);
    }

    @DeleteMapping
    public void deleteArticle(@PathVariable Long articleId) {

        // articleService.deleteArticle(articleId);
    }

}
