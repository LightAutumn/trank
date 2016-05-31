package com.yin.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by yinyuxia on 2016/5/13.
 */
public class JdbcUtil {
    private static final String driverUrl = "com.mysql.jdbc.Driver";

    private static final String url = "jdbc:mysql://localhost:3306/smail";

    private static final String username = "root";

    private static final String password = "123456";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(driverUrl);
            connection = DriverManager.getConnection(url, username, password);
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    // 测试Oracle连接是否成功
    public static void main(String[] args) {
        Connection connection = JdbcUtil.getConnection();
        System.out.println("连接成功：" + connection);

    }
}
