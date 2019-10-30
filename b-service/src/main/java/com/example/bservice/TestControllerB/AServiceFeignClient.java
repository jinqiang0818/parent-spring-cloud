package com.example.bservice.TestControllerB;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("A-SERVICE")
public interface AServiceFeignClient {

    @RequestMapping("/hello")
    public String hello();
}
