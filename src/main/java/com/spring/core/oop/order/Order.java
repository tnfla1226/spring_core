package com.spring.core.oop.order;

import lombok.*;

//주문 장보 객체
@Setter @Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Order {
    private Long memberId; //주문한 회원 아이디
    private String itemName; //상품명
    private int itemPrice;  //상품 금액
    private  int discountPrice; //할인액
}
