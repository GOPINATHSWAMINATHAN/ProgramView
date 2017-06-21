package com.ocean.java.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JButtonTest1 implements ActionListener {

    public JButtonTest1() {
        JFrame frame = new JFrame("JButtonExample");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton bn = new JButton("Show Message");
        bn.addActionListener(this);
        frame.add(bn);
        frame.setSize(250, 150);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        JOptionPane.showMessageDialog(null, "About JButton", 
                "About Swing JButton", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(final String args[]) {
        JButtonTest1 jb = new JButtonTest1();
    }
}