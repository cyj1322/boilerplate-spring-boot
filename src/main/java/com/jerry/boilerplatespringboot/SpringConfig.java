package com.jerry.boilerplatespringboot;

import com.jerry.boilerplatespringboot.repository.MemberRepository;
import com.jerry.boilerplatespringboot.repository.MemoryMemberRepository;
import com.jerry.boilerplatespringboot.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
