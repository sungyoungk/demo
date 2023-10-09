package com.example.demo.service;

import com.example.demo.controller.PostCreateRequestDto;
import com.example.demo.controller.PostUpdateRequestDto;
import com.example.demo.domain.Post;
import com.example.demo.repository.PostMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostMapper postMapper;



    public List<Post> findAll() {
       return postMapper.findAll();
    }

    public Post findById(Long articleId) {
        return postMapper.findById(articleId);
    }

    public void saveArticle(Long articleId) {
        postMapper.saveArticle(articleId);
    }

    public void deleteArticle(Long articleId) {
        postMapper.deleteArticle(articleId);
    }

    public void create(PostCreateRequestDto postCreateRequestDto) {
        postMapper.create(postCreateRequestDto);
    }

    public void update(PostUpdateRequestDto postUpdateRequestDto) {
        postMapper.update(postUpdateRequestDto);
    }

    public void deleteById(Long id) {
        postMapper.deleteById(id);
    }
}
