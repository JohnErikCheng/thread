package com.cheng.eric.cheng.jva;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @ClassName ：Config
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2019/5/14 17:19
 * @Description: 配置类。
 */
@Configuration
@ComponentScan("com.cheng.eric.cheng.jva")
@EnableAsync
public class Config {
}
