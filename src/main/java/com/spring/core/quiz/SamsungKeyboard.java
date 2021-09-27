package com.spring.core.quiz;

import org.springframework.stereotype.Component;

@Component
public class SamsungKeyboard implements KeyBoard {

    @Override
    public void info() {
        System.out.println("삼성 키보드입니다.");
    }
}
