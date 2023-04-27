package com.qf.day30.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestMain3 {
    public static void main(String[] args) throws Exception{
        findById("1002");
    }

    public static void findAll()throws Exception{
        // 1、加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 2、获得连接
        final Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/companydb?useUnicode=true&characterEncoding=utf-8&useSSL=false",
                        "root", "root");
        System.out.println(connection);
        // 3、获取数据库操作对象
        final Statement statement = connection.createStatement();
        // 4、操作sql
        String sql = "select * from account";
        // 执行sql，返回查询结果
        final ResultSet resultSet = statement.executeQuery(sql);
        // 5、处理结果
        // 循环处理
        while (resultSet.next()){
            String account = resultSet.getString("account"); // 使用列名获取
            int money = resultSet.getInt(2); // 使用序号获取
            System.out.println("account:" + account + ", money:" + money);
        }
        // 6、关闭资源
        statement.close();
        connection.close();
    }

    public static void findById(String account)throws Exception{
        // 1、加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 2、获得连接
        final Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/companydb?useUnicode=true&characterEncoding=utf-8&useSSL=false",
                        "root", "root");
        System.out.println(connection);
        // 3、获取数据库操作对象
        final Statement statement = connection.createStatement();
        // 4、操作sql
        String sql = "select * from account where account = '"+account+"'";
        // 执行sql，返回查询结果
        final ResultSet resultSet = statement.executeQuery(sql);
        // 5、处理结果
        // 循环处理
        while (resultSet.next()){
            String a = resultSet.getString("account"); // 使用列名获取
            int m = resultSet.getInt(2); // 使用序号获取
            System.out.println("account:" + a + ", money:" + m);
        }
        // 6、关闭资源
        statement.close();
        connection.close();
    }
}
