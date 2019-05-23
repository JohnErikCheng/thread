package com.cheng.eric.cheng.creat;

import java.util.Collection;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.*;

/**
 * @ClassName ：TimerThread
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2019/5/14 15:56
 * @Description: 定时器创建线程。
 */
public class TimerThread {
    public static void main(String[] args) {

        Timer tm = new Timer();
        tm.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Timer is run...");
            }
        },0,1000);
    }
}
