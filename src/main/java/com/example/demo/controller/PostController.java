package com.example.demo.controller;

import com.example.demo.domain.Post;
import com.example.demo.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @GetMapping("/post")
    public String post() {
        System.out.println("post page");
        return "/post";
    }

    @PostMapping("/post")
    @ResponseBody
    public void createPost(@RequestBody PostCreateRequestDto postCreateRequestDto) {
        postService.create(postCreateRequestDto);
    }

    @GetMapping("/post/{postId}")
    @ResponseBody
    public Post findById(@PathVariable Long postId) {
        postService.findById(postId);
        return null;
    }

    @PutMapping("/post/{postId}")
    @ResponseBody
    public void updateById(@PathVariable Long postId, @RequestBody PostUpdateRequestDto postUpdateRequestDto) {
        postService.updateById(postId, postUpdateRequestDto);

       //  articleService.saveArticle(articleId);
    }

    @DeleteMapping("/post/{postId}")
    @ResponseBody
    public void delteById(@PathVariable Long postId) {

        postService.deleteById(postId);
    }

}
