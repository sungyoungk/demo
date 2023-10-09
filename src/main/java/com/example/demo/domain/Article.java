package com.example.demo.domain;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Article {

    private String title;
    private String content;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private String createdBy;
    private String updatedBy;

}
