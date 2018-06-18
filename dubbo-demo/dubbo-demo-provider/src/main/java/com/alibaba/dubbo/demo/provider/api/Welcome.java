package com.alibaba.dubbo.demo.provider.api;

import com.alibaba.dubbo.common.extension.SPI;

@SPI("wel")
public interface Welcome {

    public String hi();
}
