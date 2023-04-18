package com.qing.fan.consumer.controller;

import com.qing.fan.api.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author QingFan
 * @version 1.0.0
 * @date 2023年04月18日 20:09
 */
@RestController
public class HelloController {

    @DubboReference(version = "1.0.0")
    private HelloService helloService;

    @RequestMapping("/hello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return helloService.sayHello(name);
    }
}
