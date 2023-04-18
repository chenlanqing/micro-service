package com.qing.fan.consumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author QingFan
 * @version 1.0.0
 * @date 2023年04月18日 20:07
 */
@EnableDubbo
@SpringBootApplication
public class DubboNacosConsumerApp {

    public static void main(String[] args) {
        SpringApplication.run(DubboNacosConsumerApp.class, args);
    }

}
