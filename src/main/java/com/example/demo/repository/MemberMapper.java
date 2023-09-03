package com.example.demo.repository;

import com.example.demo.domain.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MemberMapper {
    @Select("SELECT * FROM MEMBER")
    List<Member> findAll();
}
