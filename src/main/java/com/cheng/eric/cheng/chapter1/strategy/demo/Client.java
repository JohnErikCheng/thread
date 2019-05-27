package com.cheng.eric.cheng.chapter1.strategy.demo;

/**
 * @ClassName ：Client
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2019/5/27 17:15
 * @Description: 外部客户端。
 */
public class Client {
    public static void main(String[] args) {

        IStrategy strategy = new ConcreteStrategy2();
        StrategyContext strategyContext = new StrategyContext(strategy);
        strategyContext.contextMethod();

    }
}
