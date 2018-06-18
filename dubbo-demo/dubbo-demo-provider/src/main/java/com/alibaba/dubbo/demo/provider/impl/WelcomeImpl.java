package com.alibaba.dubbo.demo.provider.impl;

import com.alibaba.dubbo.demo.provider.api.Welcome;

public class WelcomeImpl implements Welcome {

    @Override
    public String hi() {
        return "hi, yqzhang";
    }
}
