package com.spring.core.quiz;

import com.spring.core.config.HotelConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {

    @Test
    void comTest() {

        //컴퓨터 객체를 스프링컨테이너에서 받아온 후
        //모든 부품정보가 정상적으로 출력되도록 모니터, 마우스,
        //키보드의 구현클래스를 생성하고 스프링 컨테이너에 등록하세요.
        //설정파일은 ComputerConfig라고 만들어서 사용하세요.
        ApplicationContext ct = new AnnotationConfigApplicationContext(ComputerConfig.class);
        Computer computer = ct.getBean(Computer.class);
        computer.showParts();
    }

}