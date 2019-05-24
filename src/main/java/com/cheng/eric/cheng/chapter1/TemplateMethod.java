package com.cheng.eric.cheng.chapter1;

/**
 * @ClassName ：TemplateMethod
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2019/5/23 17:45
 * @Description:
 *    线程中模板设计模式。
 *      1、创建一个类，调用print方法
 *      2、print方法内部调用wrapPrint
 *      3、创建main线程，实例化当前类
 *      4、重写wrapPrint方法
 *
 *    程序的print方法被final修饰，不能被子类重写买
 */
public class TemplateMethod {

    public final void print(String message) {
        System.out.println("##########");
        wrapPrint(message);
        System.out.println("##########");
    }

    protected void wrapPrint(String message) {
        System.out.println("父类中的wrapPrint方法。");
    }

    public static void main(String[] args) {
        TemplateMethod temp = new TemplateMethod() {
            @Override
            protected void wrapPrint(String message) {
                System.out.println("子类中的wrapPrint方法。");
                System.out.println("*"+message+"*");
            }
        };
        temp.print("Hello Thread");


        TemplateMethod temp2 = new TemplateMethod() {
            @Override
            protected void wrapPrint(String message) {
                System.out.println("子类中的wrapPrint方法。");
                System.out.println("*"+message+"*");
            }
        };
        temp2.print("Hello Thread2");
    }
}
