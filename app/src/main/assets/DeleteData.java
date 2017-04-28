package com.ocean.java.swingwithjdbc;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;

public class DeleteData implements ActionListener {

    JFrame f = new JFrame();
    JTextField t1;
    JLabel lb1;
    Button b;

    DeleteData() {
        f.setLayout(new FlowLayout());
        lb1 = new JLabel("Enter the Name");
        t1 = new JTextField(20);
        b = new Button("DELETE");
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
            int k = s.executeUpdate("delete from name where name='" + a + "'");
            if (k == 1) {
                JOptionPane.showMessageDialog(f, "Deleted Successfully");
            }
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        new DeleteData();
    }
}
