package com.spring.core.quiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {

    private final KeyBoard keyBoard;
    private final Mouse mouse;
    private final Moniter moniter;

    @Autowired  //밑에 매개변수가 필드에서 모두 final일때 생략 가능
    public Computer(KeyBoard keyBoard, Mouse mouse, Moniter moniter) {
        this.keyBoard = keyBoard;
        this.mouse = mouse;
        this.moniter = moniter;
    }

    //부품정보를 보여주는 메서드
    public void showParts() {
        keyBoard.info();
        mouse.info();
        moniter.info();
    }

}
