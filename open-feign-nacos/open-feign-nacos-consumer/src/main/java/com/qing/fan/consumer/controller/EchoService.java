package com.qing.fan.consumer.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author QingFan
 * @version 1.0.0
 * @date 2023年04月18日 21:48
 */
@FeignClient(name = "echoService", url = "localhost:8082")
public interface EchoService {

    @GetMapping("/echo/{name}")
    String echo(@PathVariable("name") String name);
}
