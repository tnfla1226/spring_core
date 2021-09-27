package com.spring.core.oop.discount;

/*
* 정률 할인 정책
* 책임: VIP회원에게 정해진 비율만큼의 할인액을 적용해준다.
* */

import com.spring.core.oop.member.Grade;
import com.spring.core.oop.member.Member;

public class RateDiscountPolicy implements DiscountPolicy {

    //할인율
    private static final double DISCOUNT_RATE = 0.2; //20%할인

    @Override
    public int discount(Member member, int itemPrice) {
        if (member.getGrade() == Grade.VIP) {
            return (int) (itemPrice * DISCOUNT_RATE);
        } else {
            return 0;
        }
    }
}
