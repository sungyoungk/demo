package com.example.demo.controller;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostUpdateRequestDto {
    private Long id;
    private String title;
    private String content;
    private LocalDateTime updatedDate;
    private String updatedBy;

    public void update(Long id, String title, String content, LocalDateTime now,String updatedBy){
        this.id = id;
        this.title = title;
        this.content = content;
        this.updatedDate = now;
        this.updatedBy = updatedBy;
    }

}
