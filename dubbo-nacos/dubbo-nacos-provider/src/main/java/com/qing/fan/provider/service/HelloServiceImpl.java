package com.qing.fan.provider.service;

import com.qing.fan.api.HelloService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author QingFan
 * @version 1.0.0
 * @date 2023年04月18日 19:58
 */
@DubboService(version = "1.0.0")
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name + ", Welcome dubbo with nacos";
    }
}
