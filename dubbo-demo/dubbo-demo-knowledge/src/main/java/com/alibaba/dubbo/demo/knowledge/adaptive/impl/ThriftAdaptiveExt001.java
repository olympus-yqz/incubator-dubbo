package com.alibaba.dubbo.demo.knowledge.adaptive.impl;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.demo.knowledge.adaptive.AdaptiveExt001;

public class ThriftAdaptiveExt001 implements AdaptiveExt001 {
    @Override
    public String echo01(String msg, URL url) {
        return "thrift 01";
    }
}


