package com.jtfr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @EnableDiscoveryClient // 开启服务SpringCloud注册发现，其实不开启也可以的，springcloud后面默认开启了。
public class NacosConsumer02Application {

    public static void main(String[] args) {
        SpringApplication.run(NacosConsumer02Application.class, args);
    }

}