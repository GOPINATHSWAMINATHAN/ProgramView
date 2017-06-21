package com.ocean.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcSelect {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/stud", "root", "");
            Statement s = c.createStatement();
            String qry = "select id, name, address, phone from student";
            ResultSet rs = s.executeQuery(qry);
            while (rs.next()) {
                String res = " ";
                int sid = rs.getInt(1);
                String sname = rs.getString(2);
                String saddress = rs.getString(3);
                long sphone = rs.getLong(4);
                res = String.valueOf(sid) + "\t" + sname + "\t" + saddress + "\t" + sphone;
                System.out.println(" Values are ::: " + res);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
