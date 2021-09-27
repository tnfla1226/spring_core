package com.spring.core.oop.discount;

import com.spring.core.oop.member.Member;

//역할: VIP회원에게 할인을 적용해줘야 한다. (ex: 정액할인, 정률할인)
public interface DiscountPolicy {

    /*
      * 할인 정책별 할인액을 계산해주는 기능
      * @param member - 할인 대상 회원장보(여기서 등급을 확인할 수 있음)
      * @param itemPrice - 할인 전 구매 금액
      * @return itemPrice에서 등급별 혜택을 적용한 총 할인액
    */


    int discount(Member member, int itemPrice);
}
