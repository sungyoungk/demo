package com.example.demo.repository;

import com.example.demo.controller.PostCreateRequestDto;
import com.example.demo.controller.PostUpdateRequestDto;
import com.example.demo.domain.Post;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface PostMapper {

    @Select("SELECT * FROM POST")
    List<Post> findAll();

    @Select("SELECT * FROM POST WHERE ID = #{postId}")
    Post findById(Long postId);

    @Update("UPDATE POST WHERE ID = #{postId}")
    void saveArticle(Long postId);

    @Delete("DELETE POST WHERE ID = #{postId}")
    void deleteArticle(Long postId);

    @Insert("INSERT INTO POST(title, content, createdDate, updatedDate, createdBy, updatedBy)" +
            "VALUES(#{title}, #{content}, #{createdDate}, #{updatedDate}, #{createdBy}, #{updatedBy})")
    void create(PostCreateRequestDto postCreateRequestDto);

    @Update("UPDATE POST SET title= #{title}, content= #{content}, updatedBy=#{updatedBy}, updatedDate=#{updatedDate} WHERE id = #{id}")
    void update(PostUpdateRequestDto postUpdateRequestDto);

    @Delete("DELETE FROM POST WHERE id = #{id}")
    void deleteById(Long id);
}
