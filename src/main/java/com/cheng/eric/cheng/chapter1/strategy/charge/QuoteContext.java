package com.cheng.eric.cheng.chapter1.strategy.charge;

import java.math.BigDecimal;

/**
 * @ClassName ：QuoteContext
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2019/5/27 17:33
 * @Description: 报价上下文角色
 */
public class QuoteContext {
    /**
     * 持有一个具体的报价策略
     */
    private IQuoteStrategy quoteStrategy;

    /**
     * 注入报价策略
     *
     * @param quoteStrategy
     */
    public QuoteContext(IQuoteStrategy quoteStrategy) {
        this.quoteStrategy = quoteStrategy;
    }

    /**
     * 回调具体报价策略的方法
     * @param originalPrice
     * @return
     */
    public BigDecimal getPrice(BigDecimal originalPrice) {
        return quoteStrategy.getPrice(originalPrice);
    }
}
