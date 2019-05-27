package com.cheng.eric.cheng.chapter1.strategy.charge;

import java.math.BigDecimal;

/**
 * @ClassName ：OldCustomeQuoteStrategy
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2019/5/27 17:27
 * @Description: 老客户报价策略实现类。
 */
public class OldCustomeQuoteStrategy implements IQuoteStrategy {
    @Override
    public BigDecimal getPrice(BigDecimal originalPrice) {
        System.out.println("恭喜！老客户享有9折优惠！");
        originalPrice = originalPrice.multiply(new BigDecimal(0.9)).setScale(2,BigDecimal.ROUND_HALF_UP);
        return originalPrice;
    }
}
