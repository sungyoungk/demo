package com.example.demo.controller;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostUpdateRequestDto {
    private String title;
    private String content;
    private LocalDateTime updatedDate;
    private String updatedBy;

    public void updateById(String title, String content, String updatedBy){
        this.title = title;
        this.content = content;
        this.updatedBy = updatedBy;
    }

}
