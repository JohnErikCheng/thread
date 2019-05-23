package com.cheng.eric.cheng.priority;

/**
 * @ClassName ：TestPriority
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2019/5/20 23:10
 * @Description:
 */
public class TestPriority {
    public static void main(String[] args) {

        Thread t1 = new Thread(new Target());
        Thread t2 = new Thread(new Target());
        Thread t3 = new Thread(new Target());

        /**
         * 设置优先级。
         */
        t1.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);


        t2.start();
        t1.start();
        t3.start();

    }
}
