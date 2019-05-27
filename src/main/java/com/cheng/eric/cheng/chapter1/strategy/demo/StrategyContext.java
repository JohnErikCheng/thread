package com.cheng.eric.cheng.chapter1.strategy.demo;

/**
 * @ClassName ：StrategyContext
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2019/5/27 17:13
 * @Description: 策略上下文。
 */
public class StrategyContext {
    /**
     * 持有一个策略实现的引用。
     *
     */
    private IStrategy strategy;

    public StrategyContext(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void contextMethod() {
        strategy.algorithmMethod();
    }
}
