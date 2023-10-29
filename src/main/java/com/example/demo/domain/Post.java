package com.example.demo.domain;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Post extends BaseDomain {

    private Long id;
    private String title;
    private String content;

    private BaseDomain baseDomain;


    public void create(String title, String content, LocalDateTime createdDate, LocalDateTime updatedDate, String updatedBy ,String createdBy) {
        this.title = title;
        this.content = content;
        this. createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.updatedBy = updatedBy;
        this.createdBy = createdBy;
    }
}
