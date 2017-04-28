package com.ocean.java.swingwithjdbc;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class UpdateData implements ActionListener{
    JFrame f = new JFrame();
    JTextField t1,t2;
    Button b1;
    JLabel l1,l2;
    
    UpdateData()
    {
        f.setLayout(new FlowLayout());
        l1 = new JLabel("Enter your  DB Name");
        l2=new JLabel("Enter the name to Change");
        t1 = new JTextField(20);
        t2=new JTextField(20);
        b1 = new Button("SAVE");
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);
        b1.addActionListener(this);
        f.setSize(200, 200);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {    
            try {
                String a = (String) t1.getText();
                String b=(String)t2.getText();
                 Class.forName("com.mysql.jdbc.Driver");
             Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/details", "root", "");
                 Statement s = c.createStatement();
                int m= s.executeUpdate("update name set name='"+b+"'where name='"+a+"'");
            if(m==1)
            {
               JOptionPane.showMessageDialog(f, "Updated successfully");
            }
            } catch (SQLException ex) {
                Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String[] args) {
        new UpdateData();
    }
}
