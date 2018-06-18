package com.alibaba.dubbo.demo.provider.impl;

import com.alibaba.dubbo.demo.provider.api.Welcome;

public class WelcomeImpl02 implements Welcome {

    @Override
    public String hi() {
        return "hi, yqzhang 02";
    }
}
