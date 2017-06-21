package com.ocean.java.swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

public class JToggleButtonTest implements ActionListener {

    JToggleButton tb;
    JLabel lbl;

    public JToggleButtonTest() {
        JFrame f = new JFrame("Selecting Toggle");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tb = new JToggleButton("Toggle Button");
        lbl = new JLabel("State of Toggle Button");
        tb.addActionListener(this);
        f.add(tb, BorderLayout.NORTH);
        f.add(lbl, BorderLayout.SOUTH);
        f.setSize(300, 125);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        AbstractButton b = (AbstractButton) ae.getSource();
        if (b.getModel().isSelected()) {
            lbl.setText("Toggle Button is On.");
        } else {
            lbl.setText("Toggle Button is Off.");
        }
    }

    public static void main(String args[]) {
        new JToggleButtonTest();
    }
}