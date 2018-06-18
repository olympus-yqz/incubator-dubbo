package com.alibaba.dubbo.demo.provider;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import com.alibaba.dubbo.demo.provider.api.Welcome;
import com.alibaba.dubbo.demo.provider.impl.WelcomeImpl;

public class Demo001 {

    public static void main(String[] args) {
        /*
         * 当前应用配置
         * */
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("dubbo-demo-001");

        /*
         * 链接注册中心配置
         * */
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://192.168.1.99");
        registryConfig.setPort(2181);

        /*
         * 协议配置
         * */
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(9088);
        protocolConfig.setThreads(20);

        /*
         * 服务提供者暴露服务配置
         * */
        /*
         * 此实例很重，封装了与注册中心的连接，请自行缓存，否则可能造成内存和连接泄漏
         * */
        ServiceConfig service = new ServiceConfig();
        service.setApplication(applicationConfig);
        service.setRegistry(registryConfig);
        service.setProtocol(protocolConfig);
        service.setInterface(Welcome.class);
        service.setRef(new WelcomeImpl());
        service.setVersion("1.0.0");

        service.export();
    }
}
