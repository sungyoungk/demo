package com.example.demo.controller;

import lombok.Getter;
import java.time.LocalDateTime;

@Getter
public class PostCreateRequestDto {

    private String title;
    private String content;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private String createdBy;
    private String updatedBy;

    public void create(String title, String content, LocalDateTime createdDate, LocalDateTime updatedDate, String updatedBy ,String createdBy) {
        this.title = title;
        this.content = content;
        this. createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.updatedBy = updatedBy;
        this.createdBy = createdBy;
    }

}
