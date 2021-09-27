package com.spring.core.quiz;

import org.springframework.stereotype.Component;

@Component
public class LogitecMouse implements Mouse {

    @Override
    public void info() {
        System.out.println("로지텍 마우스입니다.");
    }
}
