package com.example.demo.repository;

import com.example.demo.controller.MemberCreateRequestDto;
import com.example.demo.controller.MemberDeleteRequestDto;
import com.example.demo.controller.MemberUpdatedRequestDto;
import com.example.demo.domain.Member;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MemberMapper {
    @Select("SELECT * FROM MEMBER")
    List<Member> findAll();

    @Insert("INSERT INTO MEMBER(name, email, createdDate, updatedDate, createdBy, updatedBy)" +
            "VALUES(#{name}, #{email}, #{createdDate}, #{updatedDate}, #{createdBy}, #{updatedBy})")
    void create(MemberCreateRequestDto memberCreateRequestDto);

    @Select("SELECT * FROM MEMBER WHERE id = #{id}")
    Member findById(Long id);

    @Update("UPDATE MEMBER SET NAME= #{name}, email = #{email}, updatedBy=#{updatedBy}, updatedDate=#{updatedDate} WHERE id = #{id}")
    void update(MemberUpdatedRequestDto memberUpdatedRequestDto);

    @Delete("DELETE FROM MEMBER WHERE id = #{id}")
    void delete(Long id);

}
