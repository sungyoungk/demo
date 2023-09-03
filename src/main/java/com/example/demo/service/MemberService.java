package com.example.demo.service;

import com.example.demo.domain.Member;
import com.example.demo.repository.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberMapper memberMapper;

    public List<Member> findAll(){
        return memberMapper.findAll();
    }

}
