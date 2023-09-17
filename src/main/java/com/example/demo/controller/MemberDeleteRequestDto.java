package com.example.demo.controller;


public class MemberDeleteRequestDto {
    Long id;

    void delete(Long id) {
        this.id = id;
    }
}
