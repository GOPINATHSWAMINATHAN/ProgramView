package com.gopinath.java.swingwithjdbc;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class RetrieveData implements ActionListener {
    JFrame f = new JFrame();
    JLabel lb1;
    JTextArea jt;
    Button b;

    RetrieveData() {
        f.setLayout(new FlowLayout());
        lb1 = new JLabel("Enter the Name");
        b = new Button("RETRIEVE");
        jt = new JTextArea();
        f.add(lb1);
        f.add(b);
        f.add(jt);
        b.addActionListener(this);
        f.setSize(200, 200);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/details", "root", "");
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("Select name from name");
            while (rs.next()) {
                jt.setText(rs.getString("name"));
            }
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        new RetrieveData();
    }

}
