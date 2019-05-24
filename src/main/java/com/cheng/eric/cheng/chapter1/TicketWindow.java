package com.cheng.eric.cheng.chapter1;

/**
 * @ClassName ：TicketWindow
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2019/5/24 10:29
 * @Description: 模拟出票。
 */
public class TicketWindow extends Thread {

    /**
     * 柜台名称
     */
    private final String name;

    /**
     * 最多受理50笔业务
     */
    private static final int MAX = 5000;

    /**
     * index是共享资源
     * 将index添加static修饰，保证index唯一性
     * 但是随着MAX的增大，会出现线程安全性问题
     *
     * 问题：
     *  共享资源很多
     *  共享资源要经过复杂的计算
     *  而且static修饰的变量生命周期很长
     *
     * 引出Runnable接口。
     */
    private static int index = 1;

    public TicketWindow(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (index < MAX) {
            System.out.println("柜台:" + name + ",当前的号码是：" + (index++));
        }
    }

    public static void main(String[] args) {
        TicketWindow windows1 = new TicketWindow("一号柜台");
        windows1.start();

        TicketWindow windows2 = new TicketWindow("二号柜台");
        windows2.start();

        TicketWindow windows3 = new TicketWindow("三号柜台");
        windows3.start();

        TicketWindow windows4 = new TicketWindow("四号柜台");
        windows4.start();
    }
}
