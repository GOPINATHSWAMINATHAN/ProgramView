package com.gopinath.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcDelete {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int id = in.nextInt();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/stud", "root", "");
            Statement s = c.createStatement();
            String qry = "delete from student where id='" + id + "'";
            int r = s.executeUpdate(qry);
            if (r == 1) {
                System.out.println("Deleted");
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
