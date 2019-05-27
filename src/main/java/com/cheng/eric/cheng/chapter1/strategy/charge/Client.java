package com.cheng.eric.cheng.chapter1.strategy.charge;

import java.math.BigDecimal;

/**
 * @ClassName ：Client
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2019/5/27 17:36
 * @Description: 外部客户端。
 */
public class Client {
    public static void main(String[] args) {
        //1.创建老客户的报价策略
        IQuoteStrategy oldQuoteStrategy = new OldCustomeQuoteStrategy();

        //2.创建报价上下文对象，并设置具体的报价策略
        QuoteContext quoteContext = new QuoteContext(oldQuoteStrategy);

        //3.调用报价上下文的方法
        BigDecimal price = quoteContext.getPrice(new BigDecimal(100));

        System.out.println("折扣价为：" + price);
    }
}
