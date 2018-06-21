package com.alibaba.dubbo.demo.knowledge.adaptive;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.SPI;

@SPI("cloud")
public interface AdaptiveExt001 {

    @Adaptive
    public String echo01(String msg, URL url);

}


