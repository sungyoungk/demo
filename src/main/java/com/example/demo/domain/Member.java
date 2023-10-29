package com.example.demo.domain;

import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
public class Member extends BaseDomain {
    private String name;
    private String email;


}
