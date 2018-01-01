package com.gopinath.java.swing;

import javax.swing.JFrame;

public class JFrameTest extends JFrame {

    public JFrameTest() {
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Learn Swing");
        setVisible(true);
    }

    public static void main(String[] args) {
        JFrameTest f = new JFrameTest();
    }
}