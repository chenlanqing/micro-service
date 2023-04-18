package com.qing.fan.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author QingFan
 * @version 1.0.0
 * @date 2023年04月18日 19:41
 */
@EnableDubbo(scanBasePackages = {"com.qing.fan.provider.service"})
@SpringBootApplication
public class DubboNacosProviderApp {

    public static void main(String[] args) {
        SpringApplication.run(DubboNacosProviderApp.class, args);
    }
}
