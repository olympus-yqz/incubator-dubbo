package com.alibaba.dubbo.demo.knowledge.pattern.decorator;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
