package com.cheng.eric.cheng.jva;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName ：ThreadTest
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2019/5/14 17:23
 * @Description: 测试类。
 * Spring的异步任务。
 */
public class ThreadTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        ThreadService bean = context.getBean(ThreadService.class);
        bean.methodA();
        bean.methodB();
    }
}
