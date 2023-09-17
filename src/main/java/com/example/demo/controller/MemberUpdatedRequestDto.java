package com.example.demo.controller;

import java.time.LocalDateTime;


public class MemberUpdatedRequestDto {

    private Long id;
    private String name;
    private String email;
    private LocalDateTime updatedDate;
    private String updatedBy;


    public void update(Long id, String name, String email, LocalDateTime updatedDate, String updatedBy) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.updatedDate = updatedDate;
        this.updatedBy = updatedBy;
    }
}
