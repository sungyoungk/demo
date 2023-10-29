package com.example.demo.controller;

import com.example.demo.domain.Post;
import com.example.demo.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public String createPost(@ModelAttribute PostCreateRequestDto postCreateRequestDto, Model model) {
        postService.create(postCreateRequestDto);

        List<Post> posts = postService.findAll();
        model.addAttribute("posts", posts);
        return "/index";
    }

    @GetMapping("/post/{postId}")
    @ResponseBody
    public Post findById(@PathVariable Long postId) {
        postService.findById(postId);
        return null;
    }


    @GetMapping("/modifyPost")
    public String updateByIdView(@RequestParam Long postId, Model model) {
        Post post = postService.findById(postId);
        model.addAttribute("post", post);

        return "/modifyPost";
    }

    @ResponseBody
    @PutMapping("/post/{postId}")
    public void updateById(@PathVariable Long postId, @RequestBody PostUpdateRequestDto postUpdateRequestDto, Model model) {
        postService.updateById(postId, postUpdateRequestDto);
    }

    @DeleteMapping("/post/{postId}")
    @ResponseBody
    public void deleteById(@PathVariable Long postId) {

        postService.deleteById(postId);
    }

}
