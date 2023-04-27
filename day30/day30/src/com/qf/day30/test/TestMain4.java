package com.qf.day30.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestMain4 {
    public static void main(String[] args) throws Exception{
        System.out.println(login("dfgdf", "ertert' or '1' = '1"));
    }

    public static boolean login(String username, String pwd) throws Exception{
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
        String sql = "select * from users where username = '"+username+"' and pwd = '"+pwd+"'";
        // 执行sql，返回查询结果
        final ResultSet resultSet = statement.executeQuery(sql);
        // 5、处理结果
        // 循环处理
        boolean b = false;
        while (resultSet.next()){
            b = true;
            break;
        }
        // 6、关闭资源
        statement.close();
        connection.close();
        return b;
    }
}
