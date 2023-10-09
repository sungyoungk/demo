package com.example.demo.controller;

import com.example.demo.domain.Article;
import com.example.demo.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
@RequiredArgsConstructor
public class PostController {

    private final ArticleService articleService;

    @GetMapping("/post")
    public String post() {
        System.out.println("post page");
        return "/post";
    }

    @GetMapping("/post/{articleId}")
    public Article getArticle(@PathVariable Long articleId) {
        System.out.println("get article by articleId");
        return articleService.findByArticleId();
    }

    @PutMapping("/post/{articleId}")
    public void saveArticle(@PathVariable Long articleId) {
        System.out.println("save article");
        articleService.saveArticle(articleId);
    }

    @DeleteMapping
    public void deleteArticle(@PathVariable Long articleId) {

        articleService.deleteArticle(articleId);
    }

}
