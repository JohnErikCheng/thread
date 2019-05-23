package com.cheng.eric.cheng.creat;

/**
 * @ClassName ：AnonymousThread
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2019/5/14 15:02
 * @Description: 匿名内部类。
 */
public class AnonymousThread {
    public static void main(String[] args) {

        /**
         * 匿名内部类。
         * 实现runnable接口。
         */
    /*    new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 10; i++) {
                    System.out.println("线程runnable启动...");
                }
            }
        }).start();*/

        /**
         *  匿名内部类。
         *  Thread方式。
         */
       /* new Thread() {
            @Override
            public void run() {
                for(int i=0;i<=10;i++) {
                    System.out.println("线程Thread启动啦");
                }
            }
        }.start();*/


        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 10; i++) {
                    System.out.println("线程runnable启动...");
                }
            }
        }) {
            @Override
            public void run() {
                for (int i = 0; i <= 10; i++) {
                    System.out.println("线程Thread启动...");
                }
            }
        }.start();
    }
}
