package com.zhiliao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@EnableFeignClients
@EnableEurekaClient
@EnableScheduling
@EnableTransactionManagement
@SpringBootApplication
public class ZhiliaoCourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhiliaoCourseApplication.class, args);
    }

}
