package com.cheng.eric.cheng.chapter1.strategy.demo;

/**
 * @ClassName ：ConcurrentStrategy
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2019/5/27 17:12
 * @Description: 具体的策略实现。
 */
public class ConcurrentStrategy implements IStrategy {
    @Override
    public void algorithmMethod() {
        System.out.println("this is ConcreteStrategy method...");
    }
}
