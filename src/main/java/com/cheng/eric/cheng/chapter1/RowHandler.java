package com.cheng.eric.cheng.chapter1;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 策略模式：
 *
 * RowHandler接口只负责接手数据库中的结果集。
 * 至于最终返回成什么样的数据结构，可以实现该接口去实现。
 * @param <T>
 */
public interface RowHandler<T> {
    T handle(ResultSet rs) throws SQLException;
}
