package com.cheng.eric.cheng.creat;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName ：ThreadPoolExect
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2019/5/14 17:07
 * @Description: 线程池创建线程。
 */
public class ThreadPoolExect {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
       for (int i=0;i<30;i++) {
           service.execute(new Runnable() {
               @Override
               public void run() {
                   System.out.println(Thread.currentThread().getName());
               }
           });
       }
        service.shutdown();
    }
}
