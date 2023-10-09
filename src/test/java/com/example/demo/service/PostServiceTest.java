package com.example.demo.service;

import com.example.demo.controller.PostCreateRequestDto;
import com.example.demo.controller.PostUpdateRequestDto;
import com.example.demo.domain.Member;
import com.example.demo.domain.Post;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
class PostServiceTest {
    @Autowired
    private PostService postService;

    @Test
    void 게시글이_저장되는지_확인(){
        PostCreateRequestDto postCreateRequestDto = new PostCreateRequestDto();
        String title = "제목";
        String content = "내용";
        String updatedBy = "testUpdatedBy";
        String createdBy = "testCreatedBy";
        LocalDateTime now = LocalDateTime.now();
        postCreateRequestDto.create(title, content, now, now, updatedBy, createdBy);

       postService.create(postCreateRequestDto);

        //then

        Post post = postService.findById(2L);

        Assertions.assertThat(post.getTitle()).isEqualTo(title);
        Assertions.assertThat(post.getContent()).isEqualTo(content);
        Assertions.assertThat(post.getCreatedBy()).isEqualTo(createdBy);
        Assertions.assertThat(post.getUpdatedDate()).isEqualTo(now);
        Assertions.assertThat(post.getUpdatedBy()).isEqualTo(updatedBy);
        Assertions.assertThat(post.getCreatedDate()).isEqualTo(now);
    }

    @Test
    void 게시글_하나가_조회되는지_확인(){
      Post post = postService.findById(1L);

      Assertions.assertThat(post).isNotNull();
    }



    @Test
    void 게시글이_조회되는지_확인() {
        //given
        Post article = new Post();
        String title = article.getTitle();
        String content = article.getContent();
        LocalDateTime createdDate = article.getCreatedDate();
        LocalDateTime updatedDate = article.getUpdatedDate();
        //when
        List<Post> articleList = postService.findAll();

        //then
        Assertions.assertThat(articleList.size()).isEqualTo(1);
        // pk , 저장, 삭제
    }

    @Test
    void 게시글이_수정되는지_확인(){

        PostUpdateRequestDto postUpdateRequestDto = new PostUpdateRequestDto();
        LocalDateTime now = LocalDateTime.now();

        postUpdateRequestDto.update(1L, "변경 제목", "변경 내용", now, "testUpdatedBy");
        postService.update(postUpdateRequestDto);

         Post post = postService.findById(1L);

         Assertions.assertThat(post.getTitle()).isEqualTo("변경 제목");
         Assertions.assertThat(post.getContent()).isEqualTo("변경 내용");
         Assertions.assertThat(post.getUpdatedBy()).isEqualTo("testUpdatedBy");
         Assertions.assertThat(post.getUpdatedDate()).isEqualTo(now);

    }

    @Test
    @Transactional
    void 게시글이_삭제되는지_확인(){
        Long id = 1L;
        LocalDateTime now = LocalDateTime.now();

        postService.deleteById(id);

        Assertions.assertThat(postService.findById(id)).isNull();

    }
}