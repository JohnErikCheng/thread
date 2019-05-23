package com.cheng.eric.cheng.chapter1;

import ch.qos.logback.core.util.TimeUtil;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName ：TryConcurrency
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2019/5/23 15:36
 * @Description: 两个方法：
 * browseNewa():看新闻
 * enjoyMusic():听音乐
 * 结论：
 * 分别调用两个方法，一个执行完毕，再次执行下一个方法。
 * 不存在轮流执行，抢占线程的情况。
 */
public class TryConcurrency {

    public static void main(String[] args) {
        /**
         *  方式一结论：
         *      分别调用两个方法，一个执行完毕，再次执行下一个方法。
         *      不存在轮流执行，抢占线程的情况。
         */
//         browseNews();
//         enjoyMusic();


        /**
         * 方式二结论：
         *      创建一个新的线程调用browseNews();
         *      使用主线程调用enjoyMusic();
         *      线程抢占式分别执行两个方法。
         */
//        new Thread(){
//            @Override
//            public void run() {
//                browseNews();
//            }
//        }.start();
//
//        enjoyMusic();

        //使用JDK1.8+的λ表达式方式。
        new Thread(TryConcurrency::browseNews).start();
        enjoyMusic();
    }

    /**
     * 看新闻.
     */
    public static void browseNews() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName() + "--->Uh-huh,the good news.");
            sleep(2);
        }
    }

    /**
     * 听音乐.
     */
    public static void enjoyMusic() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName() + "--->Uh-huh,the good music.");
            sleep(2);
        }
    }

    /**
     * 设置休眠时间。
     *
     * @param seconds：休眠的毫秒数。
     */
    public static void sleep(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
