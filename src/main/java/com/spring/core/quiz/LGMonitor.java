package com.spring.core.quiz;

import org.springframework.stereotype.Component;

@Component
public class LGMonitor implements Moniter {

    @Override
    public void info() {
        System.out.println("LG 모니터입니다.");
    }
}
