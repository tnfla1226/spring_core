package com.spring.core.oop.member;

import lombok.*;

@Setter @Getter
@AllArgsConstructor //모든 필드 초기화 생성자
@NoArgsConstructor  //기본 생성자
@ToString
public class Member {

    private Long id;    //회원 식별코드
    private String name;    //회원명
    private Grade grade;   //회원등급

    //자바 빈즈 규약
    /*
        1. 기본생성자 만들것
        2. 모든 필드 초기화 생성자
        3. setter / getter
        4. hashcode / toString
    */


}
