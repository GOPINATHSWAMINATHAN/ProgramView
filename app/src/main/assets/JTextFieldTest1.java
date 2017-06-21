package com.ocean.java.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JTextFieldTest1 implements ActionListener {

    JTextField tf;
    JLabel lbl1, lbl2;

    public JTextFieldTest1() {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());
        lbl1 = new JLabel("Enter Name : ");
        tf = new JTextField(15);
        lbl2 = new JLabel();
        tf.setText("OCEAN ACADEMY");
        f.add(lbl1);
        f.add(tf);
        f.add(lbl2);
        tf.addActionListener(this);
        f.setSize(200, 150);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        JTextField t = (JTextField) ae.getSource();
        lbl2.setText(t.getText());
    }

    public static void main(String[] a) {
        new JTextFieldTest1();
    }
}