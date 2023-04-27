package com.qf.day30.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestMain2 {
    public static void main(String[] args) throws Exception{
        delete("1003");
    }

    public static void delete(String account)throws Exception{
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
        String sql = "delete from account where account = '"+account+"'";
        // 执行sql，返回所影响的行数
        final int count = statement.executeUpdate(sql);
        // 5、处理结果
        System.out.println(count);
        if (count > 0){
            System.out.println("删除成功");
        }else{
            System.out.println("删除失败");
        }
        // 6、关闭资源
        statement.close();
        connection.close();
    }
}
