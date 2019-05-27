package com.cheng.eric.cheng.chapter1.strategy.charge;

import java.math.BigDecimal;

/**
 * @ClassName ：IQuoteStrategy
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2019/5/27 17:23
 * @Description: 公共报价策略接口.
 */
public interface IQuoteStrategy {
    BigDecimal getPrice(BigDecimal originalPrice);
}
