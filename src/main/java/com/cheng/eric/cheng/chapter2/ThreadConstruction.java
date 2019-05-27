package com.cheng.eric.cheng.chapter2;

/**
 * @ClassName ：ThreadConstruction
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2019/5/25 18:02
 * @Description: 线程的构造之stackSize.
 */
public class ThreadConstruction {
    public static void main(String[] args) {
        //判断参数是否为空，成立则退出系统。
        //不知道这段代码的含义
//        if (args.length < 1) {
//            System.out.println("Please enter the stack size.");
//            System.exit(1);
//        }

        ThreadGroup group = new ThreadGroup("TestGroup");

        //匿名内部类创建的方式。
        Runnable runnable = new Runnable() {

            final int MAX = Integer.MAX_VALUE;

            @Override
            public void run() {
                int i = 0;
                //调用递归方法
                recurse(i);
            }

            private void recurse(int i) {
                System.out.println(i);
                if (i < MAX) {
                    recurse(i + 1);
                }
            }
        };

        Thread thread = new Thread(group, runnable, "Test");
        thread.start();
    }
}
