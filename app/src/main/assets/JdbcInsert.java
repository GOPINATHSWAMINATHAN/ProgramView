package com.gopinath.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsert {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/stud", "root", "");
            Statement s = c.createStatement();
            int r = s.executeUpdate("insert into student (id, name, address, phone) values( 108, 'OCEAN', 'ACADEMY', '123456')");
            if (r == 1) {
                System.out.println("Inserted");
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}