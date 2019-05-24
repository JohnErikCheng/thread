package com.cheng.eric.cheng.chapter1.jdbc;

import java.sql.*;
import java.util.Arrays;

/**
 * @ClassName ：JdbcTest
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2019/5/24 16:38
 * @Description: JDBC连接数据库测试。
 */
public class JdbcTest {

    public static void main(String[] args) {
        final String URL = "jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2B8 ";
        final String USER = "root";
        final String PWD = "123456";
        Connection connection = null;
        Statement stmt = null;
        ResultSet resultSet = null;
        try {
            //1、加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2、创建连接
            connection = DriverManager.getConnection(URL, USER, PWD);
            //3、执行sql
            stmt = connection.createStatement();
            resultSet = stmt.executeQuery("select * from dept");
            //4、处理数据库结果
            while (resultSet.next()) {
                System.out.println("部门号:"+resultSet.getString("deptno")+"部门名称:"+resultSet.getString("dname")+"部门号:"+resultSet.getString("loc"));
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException e) {

            }
        }


    }
}
