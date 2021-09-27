package com.spring.core.oop.discount;

import com.spring.core.oop.member.Grade;
import com.spring.core.oop.member.Member;

/*
* 정액 할인 정책 구현 클래스
* 책임: VIP회원에게 고정된 액수의 할인액을 계산해준다.
* */



public class FixDiscountPolicy implements DiscountPolicy {

    //고정 할인액
    private static final int FIX_AMOUNT = 1000;

    @Override
    public int discount(Member member, int itemPrice) {
        if (member.getGrade() == Grade.VIP) {
            return 1000;
        } else {
            return 0;
        }
    }
}
