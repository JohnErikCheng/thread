package com.cheng.eric.cheng.creat;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @ClassName ：ByReturnThread
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2019/5/14 15:40
 * @Description:
 *  使用Callable和Future创建线程
 *  带返回值的线程。
 */
public class ByReturnThread implements Callable<Integer> {

    public static void main(String[] args) {
        ByReturnThread byReturnThread = new ByReturnThread();
        FutureTask<Integer> task = new FutureTask<>(byReturnThread);

        Thread thread = new Thread(task);
        thread.start();

        System.out.println("我先干点别的...");

        try {
            Integer result = task.get();
            System.out.println("返回的结果是:"+ result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }

    @Override
    public Integer call() throws Exception {
        System.out.println("正在进行紧张的计算...");
        Thread.sleep(3000);
        return 1;
    }
}
