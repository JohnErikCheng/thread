package com.cheng.eric.cheng.creat;

/**
 * @ClassName ：MyThreadImpl
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2019/5/14 14:47
 * @Description: 实现runnable接口。
 */
public class MyThreadImpl implements Runnable {

    private String name;

    public MyThreadImpl(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(name + "线程启动,,,");
        }
    }

    public static void main(String[] args) {
        Thread th1 = new Thread(new MyThreadImpl("线程A"));
        Thread th2 = new Thread(new MyThreadImpl("线程B"));

        th1.start();
        th2.start();
    }
}
