package com.cheng.eric.cheng.chapter1;

import java.sql.*;

/**
 * @ClassName ：RecordQuery
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2019/5/24 16:23
 * @Description: 记录查询。
 */
public class RecordQuery {

    private final Connection connection;

    public RecordQuery(Connection connection) {
        this.connection = connection;
    }

    /**
     * query方法只负责将数据查询出来，然后调用RowHandler进行数据的封装。
     * 至于将数据封装成什么数据结构，自己处理。
     *
     * @param handler
     * @param sql
     * @param params
     * @param <T>
     * @return
     * @throws SQLException
     */
    public <T> T query(RowHandler<T> handler, String sql, Object... params) throws SQLException {
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            int index = 1;
            for (Object param : params) {
                stmt.setObject(index++, param);
            }

            ResultSet resultSet = stmt.executeQuery();
            return handler.handle(resultSet);
        }
    }

    public static void main(String[] args) throws SQLException {
        String URL = "jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2B8";
        String USER = "root";
        String PWD = "123456";
        String SQL = "select * from dept";
        RecordQuery recordQuery = new RecordQuery(DriverManager.getConnection(URL, USER, PWD));
        recordQuery.query(new RowHandler<Object>() {
            @Override
            public Object handle(ResultSet resultSet) throws SQLException {

                while(resultSet.next()) {
                    System.out.println("部门号:"+resultSet.getString("deptno")+"部门名称:"+resultSet.getString("dname")+"部门号:"+resultSet.getString("loc"));
                }

                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return null;
            }
        },SQL);
    }

}
