package com.example.demo.service;

import com.example.demo.domain.Article;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
class ArticleServiceTest {
    @Autowired
    private ArticleService articleService;

    @Test
    void 게시글이_조회되는지_확인() {
        //given
        Article article = new Article();
        String title = article.getTitle();
        String content = article.getContent();
        LocalDateTime createdDate = article.getCreatedDate();
        LocalDateTime updatedDate = article.getUpdatedDate();
        //when
        List<Article> articleList = articleService.findAll();

        //then
        Assertions.assertThat(articleList.size()).isEqualTo(1);
        // pk , 저장, 삭제
    }
}