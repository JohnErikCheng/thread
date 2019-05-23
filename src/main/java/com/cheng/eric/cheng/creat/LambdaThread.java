package com.cheng.eric.cheng.creat;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName ：LambdaThread
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2019/5/14 17:47
 * @Description: 兰布达表达式创建线程。
 */
public class LambdaThread {
    public static void main(String[] args) {

        List<Integer> val = Arrays.asList(10,20,30,40);
        LambdaThread thread = new LambdaThread();
        Integer result = thread.calc(val);
        System.out.println("计算结果是："+result);
    }

    public Integer calc(List<Integer> value) {
        value.parallelStream().forEach(System.out :: println);
        int sum = value.parallelStream().mapToInt(a -> a).sum();
        return sum;
    }
}
