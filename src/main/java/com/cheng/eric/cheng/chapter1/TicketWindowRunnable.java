package com.cheng.eric.cheng.chapter1;

/**
 * @ClassName ：TicketWindowRunnable
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2019/5/25 11:52
 * @Description: 使用runnable的方式实现叫号。
 */
public class TicketWindowRunnable implements Runnable{

    /**
     * 最大叫号数。
     */
    private final Integer MAX = 50;

    /**
     * 起始号码数。
     */
    private Integer index = 0;

    @Override
    public void run() {
        while(index < MAX) {
            System.out.println(Thread.currentThread().getName()+"请"+(index++)+"号去办理业务。");
        }
    }

    public static void main(String[] args) {
        TicketWindowRunnable task =  new TicketWindowRunnable();
        Thread t1 = new Thread(task,"一号窗口");
        t1.start();
        Thread t2 = new Thread(task,"二号窗口");
        t2.start();
        Thread t3 = new Thread(task,"三号窗口");
        t3.start();
        Thread t4 = new Thread(task,"四号窗口");
        t4.start();
    }
}
