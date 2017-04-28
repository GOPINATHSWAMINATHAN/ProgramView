package com.ocean.java.swingwithjdbc;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class StoreData implements ActionListener {

    JFrame f = new JFrame();
    JTextField t1;
    JLabel lb1;
    Button b;

    public StoreData() {
        f.setLayout(new FlowLayout());
        lb1 = new JLabel("Enter your Name");
        t1 = new JTextField(20);
        b = new Button("SAVE");
        f.add(lb1);
        f.add(t1);
        f.add(b);
        b.addActionListener(this);
        f.setSize(200, 200);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String a = (String) t1.getText();
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/details", "root", "");
            Statement s = c.createStatement();
            int k = s.executeUpdate("insert into name(name)values('" + a + "')");
            if (k == 1) {
                JOptionPane.showMessageDialog(f, "Inserted Successfully");
            }
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }

    public static void main(String[] args) {
        new StoreData();
    }

}
