package com.cheng.eric.cheng.priority;

/**
 * @ClassName ：Target
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2019/5/20 22:58
 * @Description: 实现runnable接口的目标类。
 */
public class Target implements Runnable {
    @Override
    public void run() {
        while(true) {
            System.out.println(Thread.currentThread().getName()+"......");
        }
    }
}
