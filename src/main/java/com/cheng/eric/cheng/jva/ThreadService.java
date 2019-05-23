package com.cheng.eric.cheng.jva;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @ClassName ：ThreadService
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2019/5/14 17:21
 * @Description:
 */
@Service
public class ThreadService {

    @Async
    public void methodA() {
       while(true) {
           System.out.println("方法A......");
       }
    }

    @Async
    public void methodB() {
        while(true) {
            System.out.println("方法B......");
        }
    }
}
