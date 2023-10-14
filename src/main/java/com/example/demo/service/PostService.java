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

    public Post findById(Long postId) {
        return postMapper.findById(postId);
    }

    public void create(PostCreateRequestDto postCreateRequestDto) {
        postMapper.create(postCreateRequestDto);
    }

    public void updateById(Long postId, PostUpdateRequestDto postUpdateRequestDto) {
        postMapper.updateById(postId, postUpdateRequestDto);
    }

    public void deleteById(Long postId) {
        postMapper.deleteById(postId);
    }
}
