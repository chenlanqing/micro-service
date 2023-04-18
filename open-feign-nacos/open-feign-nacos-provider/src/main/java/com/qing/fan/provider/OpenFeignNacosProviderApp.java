package com.qing.fan.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author QingFan
 * @version 1.0.0
 * @date 2023年04月18日 21:22
 */
@EnableDiscoveryClient
@SpringBootApplication
public class OpenFeignNacosProviderApp {

    public static void main(String[] args) {
        SpringApplication.run(OpenFeignNacosProviderApp.class, args);
    }
}
