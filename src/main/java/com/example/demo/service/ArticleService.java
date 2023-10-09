package com.example.demo.service;

import com.example.demo.domain.Article;
import com.example.demo.repository.ArticleMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleService {

    private final ArticleMapper articleMapper;



    public List<Article> findAll() {
       return articleMapper.findAll();
    }

    public Article findByArticleId(Long articleId) {
        return articleMapper.findByArticleId(articleId);
    }

    public void saveArticle(Long articleId) {
        articleMapper.saveArticle(articleId);
    }

    public void deleteArticle(Long articleId) {
        articleMapper.deleteArticle(articleId);
    }
}
