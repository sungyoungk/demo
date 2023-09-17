package com.example.demo.service;

import com.example.demo.controller.MemberCreateRequestDto;
import com.example.demo.controller.MemberDeleteRequestDto;
import com.example.demo.controller.MemberUpdatedRequestDto;
import com.example.demo.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootTest
class MemberServiceTest {
    @Autowired
    private MemberService memberService;

    @Test
    void 사용자_데이터가_정상적으로_저장되는지_확인한다() {

        //given
        MemberCreateRequestDto memberCreateRequestDto = new MemberCreateRequestDto();


        String name = "이름";
        String email = "test@email.com";
        String createdBy = "testCreatedBy";
        LocalDateTime now = LocalDateTime.now();
        String updatedBy = "testUpdatedBy";
        memberCreateRequestDto.create(name, email, now, now, createdBy, updatedBy);

        //when
        memberService.create(memberCreateRequestDto);


        //then
        Assertions.assertThat(memberService.findAll().size()).isEqualTo(9);
        Member member = memberService.findById(9L);

        Assertions.assertThat(member.getName()).isEqualTo(name);
        Assertions.assertThat(member.getEmail()).isEqualTo(email);
        Assertions.assertThat(member.getCreatedBy()).isEqualTo(createdBy);
        Assertions.assertThat(member.getUpdatedDate()).isEqualTo(now);
        Assertions.assertThat(member.getUpdatedBy()).isEqualTo(updatedBy);
        Assertions.assertThat(member.getCreatedDate()).isEqualTo(now);

    }

    @Test
    void 사용자_정보가_업데이트_되었는지_확인() {
        //given
        MemberUpdatedRequestDto memberUpdatedRequestDto = new MemberUpdatedRequestDto();
        String updatedBy = "변경이름";
        String upatedEmail = "update@email.com";
        String updatedBy1 = "testUpdatedBy";
        LocalDateTime now = LocalDateTime.now();



        memberUpdatedRequestDto.update(1L , updatedBy, upatedEmail, now, updatedBy1);
        //when
        memberService.update(memberUpdatedRequestDto);


        //then
        Member member = memberService.findById(1L);
        Assertions.assertThat(member.getName()).isEqualTo(updatedBy);
        Assertions.assertThat(member.getEmail()).isEqualTo(upatedEmail);
        Assertions.assertThat(member.getUpdatedBy()).isEqualTo(updatedBy1);
        Assertions.assertThat(member.getUpdatedDate()).isEqualTo(now);

    }

    @Test
    void 사용자가_삭제되었는지_확인하기() {
        // given
        MemberDeleteRequestDto deleteRequestDto = new MemberDeleteRequestDto();
        Long id = 1L;
        //when
        memberService.delete(id);

        //then
        Assertions.assertThat(memberService.findAll().size()).isEqualTo(7);

    }
}