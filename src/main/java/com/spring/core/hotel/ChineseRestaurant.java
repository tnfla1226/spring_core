package com.spring.core.hotel;

import org.springframework.stereotype.Component;

@Component("cr")
public class ChineseRestaurant implements Restaurant {

    private final Chef chef;

    public ChineseRestaurant(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void orderDinner() {
        System.out.println("중국요리를 주문합니다.");
        chef.cook();
    }
}
