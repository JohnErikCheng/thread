package com.cheng.eric.cheng.chapter1;

/**
 * @ClassName ：TwiceCallThread
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2019/5/23 16:53
 * @Description: 两次调用线程。会出错！
 */
public class TwiceCallThread {
    public static void main(String[] args) {
        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println("我是新创建的线程，非主线程！");
            }
        };

        thread.start();
        thread.start();

        /**
         * Exception in thread "main" java.lang.IllegalThreadStateException
         * 	at java.lang.Thread.start(Thread.java:708)
         * 	at com.cheng.eric.cheng.chapter1.TwiceCallThread.main(TwiceCallThread.java:20)
         */
    }
}
