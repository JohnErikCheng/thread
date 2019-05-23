package com.cheng.eric.cheng.chapter1;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName ：TwiceCallThread2
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2019/5/23 17:04
 * @Description:
 */
public class TwiceCallThread2 {
    public static void main(String[] args) {

        Thread thread = new Thread(){
            @Override
            public void run() {
                try {
                    System.out.println("我不是主线程！");
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        thread.start();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.start();
    }
}
