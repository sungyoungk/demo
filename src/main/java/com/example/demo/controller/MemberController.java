package com.example.demo.controller;

import com.example.demo.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping
    public String create() {


        return "/hello";
    }

    @GetMapping
    public String findAll() {
        memberService.findAll();
        System.out.println(memberService.findAll());
        return "/hello";
    }

    @PutMapping
    public String modify(){
        return "/hello";
    }
    
    @DeleteMapping
    public String deleteMember() {
        return "/hello";
    }
}
