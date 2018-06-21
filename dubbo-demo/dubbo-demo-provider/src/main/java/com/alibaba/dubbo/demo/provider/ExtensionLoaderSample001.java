package com.alibaba.dubbo.demo.provider;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.demo.provider.api.Welcome;

public class ExtensionLoaderSample001 {

    /*
     * 利用DUBBO的SPI机制，加载类
     * */
    public static void main(String[] args) {

        ExtensionLoader loader = ExtensionLoader.getExtensionLoader(Welcome.class);
        Welcome welcome = (Welcome) loader.getExtension("wel");

        System.out.println(welcome.hi());
    }
}
