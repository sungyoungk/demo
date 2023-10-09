package com.example.demo.repository;

import com.example.demo.domain.Article;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
@Mapper
public interface ArticleMapper {

    @Select("SELECT * FROM ARTICLE")
    List<Article> findAll();

    @Select("SELECT * FROM ARTICLE WHERE ID = #{articleId}")
    Article findByArticleId(Long articleId);

    @Update("UPDATE ARTICLE WHERE ID = #{articleId}")
    void saveArticle(Long articleId);

    @Delete("DELETE ARTICLE WHERE ID = #{articleId}")
    void deleteArticle(Long articleId);
}
