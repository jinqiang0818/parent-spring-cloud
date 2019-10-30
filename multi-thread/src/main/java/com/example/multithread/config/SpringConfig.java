package com.example.multithread.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
@ComponentScan(basePackages = "com.example.multithread")
public class SpringConfig {

    @Bean
    public ThreadPoolTaskExecutor openThreadPoolTaskExecutor(){
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setKeepAliveSeconds(300);
        threadPoolTaskExecutor.setCorePoolSize(5);//核心线程池数
        threadPoolTaskExecutor.setMaxPoolSize(20); // 最大线程
        threadPoolTaskExecutor.setQueueCapacity(1000);//队列容量
        threadPoolTaskExecutor.setRejectedExecutionHandler(new java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy()); //队列满，线程被拒绝执行策略
        return threadPoolTaskExecutor;
    }
}
