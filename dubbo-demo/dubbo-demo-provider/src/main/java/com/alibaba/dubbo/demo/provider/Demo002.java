package com.alibaba.dubbo.demo.provider;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.demo.provider.api.Welcome;

public class Demo002 {

    public static void main(String[] args) {

        ExtensionLoader loader = ExtensionLoader.getExtensionLoader(Welcome.class);
        Welcome welcome = (Welcome) loader.getExtension("wel");

        System.out.println(welcome.hi());
    }
}
