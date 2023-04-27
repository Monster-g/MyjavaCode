package com.qf.day30.test;

import java.sql.*;

public class TestMain5 {
    public static void main(String[] args) throws Exception{
        System.out.println(login("dfgdf", "121212"));
    }

    public static boolean login(String username, String pwd) throws Exception{
        // 1、加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 2、获得连接
        final Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/companydb?useUnicode=true&characterEncoding=utf-8&useSSL=false",
                        "root", "root");
        System.out.println(connection);
        // 4、操作sql
        String sql = "select * from users where username = ? and pwd = ?";
        // 3、获取数据库操作对象
        final PreparedStatement preparedStatement = connection.prepareStatement(sql);
        // 传入参数
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, pwd);
        // 执行sql，返回查询结果
        final ResultSet resultSet = preparedStatement.executeQuery();
        // 5、处理结果
        // 循环处理
        boolean b = false;
        while (resultSet.next()){
            b = true;
            break;
        }
        // 6、关闭资源
        resultSet.close();
        preparedStatement.close();
        connection.close();
        return b;
    }
}
