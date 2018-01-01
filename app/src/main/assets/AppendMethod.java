package com.gopinath.java.string;

public class AppendMethod {

    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer(40);

        sb = sb.append('O');
        System.out.println(" String 1 = " + sb);

        sb.append(new char[]{'C', 'E', 'A', 'N', ' '});
        System.out.println(" String 2 = " + sb);

        sb.append(true);
        System.out.println(" String 3 = " + sb);

        sb.append(10);
        System.out.println(" String 4 = " + sb);

        sb.append(20l);
        System.out.println(" String 5 = " + sb);

        sb.append(30.5f);
        System.out.println(" String 6 = " + sb);

        sb.append(40.5d);
        System.out.println(" String 7 = " + sb);
    }
}