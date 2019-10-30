package com.example.multithread.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;

@RestController
public class TestThreadController {

    @Autowired
    private ThreadPoolTaskExecutor executor;

//    @PostMapping("/test.do") //这个不能识别
    @RequestMapping("/test.do") //这个可以识别，原因不明
    public String testThreadMethod(){
        final List<Integer> resutls = new CopyOnWriteArrayList<>();
        final CountDownLatch countDownLatch = new CountDownLatch(5);
        for (int i = 0; i < 5 ; i++) {
            final int index = i;
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    resutls.add(index);
                    System.out.println("123");
                    countDownLatch.countDown();
                }
            });
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            System.out.println("error e");
        }
        System.out.println(resutls);
        return resutls.toString();
    }
}
