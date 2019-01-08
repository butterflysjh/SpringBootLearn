package com.example.demo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ScheduledService {
    @Scheduled(fixedDelay = 1000*3)
    public void test1(){
        System.out.println("test1:"+new Date());
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
//    @Scheduled(fixedRate = 1000*3)
//    public void test2(){
//        System.out.println("test2:"+new Date());
//        try {
//            Thread.sleep(1000*5);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
}
