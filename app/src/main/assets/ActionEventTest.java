package com.gopinath.java.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ActionEventTest implements ActionListener {

    ActionEventTest() {
        JFrame f = new JFrame("Java Programs");
        JButton b = new JButton("Message");

        f.add(b);
        b.addActionListener(this);

        f.setSize(200, 100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JOptionPane.showConfirmDialog(null, "Learn Event Handling...",
                "Just a test", JOptionPane.PLAIN_MESSAGE);
    }

    public static void main(String args[]) {
        new ActionEventTest();
    }
}