package com.cheng.eric.cheng.creat;

/**
 * @ClassName ：MyThreadExt
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2019/5/14 14:34
 * @Description: 继承Thread类。
 */
public class MyThreadExt extends Thread {

    public MyThreadExt(String name) {
        setName(name);
    }

    @Override
    public void run() {
        for(int i=0;i<=10;i++) {
            System.out.println(getName()+"线程启动...");
        }
    }

    public static void main(String[] args) {
        MyThreadExt ext1 = new MyThreadExt("线程1===>");
        MyThreadExt ext2 = new MyThreadExt("线程2===>");
        ext1.start();
        ext2.start();
    }
}
