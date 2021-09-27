package com.spring.core.hotel;

import com.spring.core.config.HotelConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class HotelTest {

    @Test
    @DisplayName("호텔 예약 테스트가 성공해야 한다.")
    void reserveTest() {
        ApplicationContext ct = new AnnotationConfigApplicationContext(HotelConfig.class);
        Hotel hotel = ct.getBean(Hotel.class);
        hotel.reserve();
    }
}