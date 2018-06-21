package com.alibaba.dubbo.demo.knowledge.classloader;

import java.net.URL;

public class Sample001 {
    public static void main(String[] args) {

        URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();

        for (URL url : urls) {
            System.out.println(url.toExternalForm());
        }

        System.out.println("************************");

        System.out.println(System.getProperty("sun.boot.class.path"));
    }
}
