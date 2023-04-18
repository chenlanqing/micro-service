package com.qing.fan.consumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author QingFan
 * @version 1.0.0
 * @date 2023年04月18日 21:50
 */
@RestController
public class TestController {

    @Resource
    private EchoService echoService;

    @GetMapping("/echo")
    public String echo(@RequestParam String name) {
        return echoService.echo(name);
    }
}
