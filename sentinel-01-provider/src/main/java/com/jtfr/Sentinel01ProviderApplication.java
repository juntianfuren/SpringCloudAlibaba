package com.jtfr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient // 开启服务SpringCloud注册发现，其实不开启也可以的，springcloud后面默认开启了。
public class Sentinel01ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(Sentinel01ProviderApplication.class, args);
    }

}