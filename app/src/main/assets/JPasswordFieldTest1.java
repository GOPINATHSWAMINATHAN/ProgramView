package com.ocean.java.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class JPasswordFieldTest1 implements ActionListener {

    JPasswordField pf;
    JLabel lbl1, lbl2;

    public JPasswordFieldTest1() {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());
        lbl1 = new JLabel("Enter Password : ");
        pf = new JPasswordField(15);
        lbl2 = new JLabel();
        f.add(lbl1);
        f.add(pf);
        f.add(lbl2);
        pf.addActionListener(this);
        f.setSize(200, 150);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        JPasswordField t = (JPasswordField) ae.getSource();
        lbl2.setText(new String(t.getPassword()));
    }

    public static void main(String[] a) {
        new JPasswordFieldTest1();
    }
}