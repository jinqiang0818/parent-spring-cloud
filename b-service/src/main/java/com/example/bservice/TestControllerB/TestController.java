package com.example.bservice.TestControllerB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private AServiceFeignClient aServiceFeignClient;

    @RequestMapping("/call")
    public String call() {
        String result = aServiceFeignClient.hello();
        return "b to a 访问结果 ----- " + result;
    }
}
