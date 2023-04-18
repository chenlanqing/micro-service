package com.qing.fan.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author QingFan
 * @version 1.0.0
 * @date 2023年04月18日 21:23
 */
@RestController
public class EchoController {

    @GetMapping("/echo/{name}")
    public String echo(@PathVariable("name") String name) {
        System.err.println("远程调用服务");
        return "Hello Open Feign Nacos Discovery " + name;
    }
}
