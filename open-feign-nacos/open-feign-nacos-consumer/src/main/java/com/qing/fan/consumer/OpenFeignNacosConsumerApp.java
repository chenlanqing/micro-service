package com.qing.fan.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author QingFan
 * @version 1.0.0
 * @date 2023年04月18日 21:22
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class OpenFeignNacosConsumerApp {

    public static void main(String[] args) {
        SpringApplication.run(OpenFeignNacosConsumerApp.class, args);
    }
}
