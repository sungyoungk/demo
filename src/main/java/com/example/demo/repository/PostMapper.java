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
            "VALUES(#{title}, #{content}, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, #{createdBy}, #{updatedBy})")
    void create(PostCreateRequestDto postCreateRequestDto);

    @Update("UPDATE POST SET title= #{postUpdateRequestDto.title}, content= #{postUpdateRequestDto.content}, updatedBy=#{postUpdateRequestDto.updatedBy}, updatedDate=CURRENT_TIMESTAMP WHERE id = #{postId}")
    void updateById(Long postId, PostUpdateRequestDto postUpdateRequestDto);

    @Delete("DELETE FROM POST WHERE id = #{postId}")
    void deleteById(Long postId);
}
