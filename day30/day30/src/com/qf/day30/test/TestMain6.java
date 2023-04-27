package com.qf.day30.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestMain6 {
    public static void main(String[] args) throws Exception{
        add(new Account("1005", 8000));
    }

    public static void add(Account account)throws Exception{
        // 1、加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 2、获得连接
        final Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/companydb?useUnicode=true&characterEncoding=utf-8&useSSL=false",
                        "root", "root");
        System.out.println(connection);
        // 4、操作sql
        String sql = "insert into account values (?, ?)";
        // 3、获取数据库操作对象
        final PreparedStatement preparedStatement = connection.prepareStatement(sql);
        // 传入参数
        preparedStatement.setString(1, account.getAccount());
        preparedStatement.setInt(2, account.getMoney());
        // 执行sql，返回所影响的行数
        final int count = preparedStatement.executeUpdate();
        // 5、处理结果
        System.out.println(count);
        if (count > 0){
            System.out.println("添加成功");
        }else{
            System.out.println("添加失败");
        }
        // 6、关闭资源
        preparedStatement.close();
        connection.close();
    }
}
