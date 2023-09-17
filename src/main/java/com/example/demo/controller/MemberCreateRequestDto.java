package com.example.demo.controller;

import lombok.Getter;

import java.time.LocalDateTime;
@Getter
public class MemberCreateRequestDto {

private String name;
private String email;
private LocalDateTime createdDate;
private LocalDateTime updatedDate;
private String createdBy;
private String updatedBy;


public void create(String name, String email, LocalDateTime createdDate, LocalDateTime updatedDate, String createdBy, String updatedBy){
    this.name= name;
    this.email = email;
    this.createdDate = createdDate;
    this.updatedDate = updatedDate;
    this.createdBy = createdBy;
    this.updatedBy = updatedBy;
}


}
