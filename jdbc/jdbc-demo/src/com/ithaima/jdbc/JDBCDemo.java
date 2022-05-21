package com.ithaima.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDemo {
    public static void main(String[] args) throws Exception {
        //regist
        Class.forName("com.mysql.cj.jdbc.Driver");

        //get the link
        String url = "jdbc:mysql://localhost:3306/db1";
        String username = "root";
        String password = "";
        Connection conn = DriverManager.getConnection(url,username,password);

        String sql = "update stu set birthday = '1988-01-01' where id = 4";

        Statement stmt = conn.createStatement();

        int count = stmt.executeUpdate(sql);

        System.out.println(count);

        stmt.close();
        conn.close();
    }
}
