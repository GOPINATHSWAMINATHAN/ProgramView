package com.ocean.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JdbcPrepardStatement {

    public static void main(String args[]) {
        int sid;
        String sname;
        String saddress;
        String sphone;
        String smobile;
        String res;
        String s1;
        Scanner in = new Scanner(System.in);
        s1 = in.next();
        s1 = s1.toUpperCase();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/stud", "root", "");
            String qry = "select id, name, address, phone from student where name ='" + s1 + "'";
            PreparedStatement pst = c.prepareStatement(qry);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                res = " ";
                sid = rs.getInt(1);
                sname = rs.getString(2);
                saddress = rs.getString(3);
                sphone = rs.getString(4);
                res = String.valueOf(sid) + "\t" + sname + "\t" + saddress + "\t" + sphone;
                System.out.println(" Values are ::: " + res);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
