package com.spring.core.oop.config;

import com.spring.core.oop.member.MemberRepository;
import com.spring.core.oop.member.MemberService;
import com.spring.core.oop.member.MemoryMemberRepository;
import com.spring.core.oop.order.OrderService;

//객체를 생성하고 필요한 곳에 주입해주는 역할
public class AppConfig {

    //회원저장소를 선택하는 기능
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    //회원 서비스 객체 생성해주는 기능
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    //주문 서비스 객체 생성 기능
    public OrderService orderService() {
        return new OrderService(memberRepository());
    }
}
