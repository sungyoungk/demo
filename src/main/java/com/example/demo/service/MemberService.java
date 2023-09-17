package com.example.demo.service;

import com.example.demo.controller.MemberCreateRequestDto;
import com.example.demo.controller.MemberUpdatedRequestDto;
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


    public void create(MemberCreateRequestDto memberCreateRequestDto) {
        memberMapper.create(memberCreateRequestDto);
    }

    public Member findById(Long id) {
       return memberMapper.findById(id);
    }

    public void update(MemberUpdatedRequestDto memberUpdatedRequestDto) {
        memberMapper.update(memberUpdatedRequestDto);
    }

    public void delete(Long id) {
        memberMapper.delete(id);
    }
}
