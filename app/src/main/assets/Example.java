/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gopinath.java.inheritance;


public class Example {
  
    public Example() {
        System.out.println("This is a super class");
    }
}

class Ex1 extends Example {
   
    public Ex1() {
        System.out.println("This is sub class 01");
    }    
}

class Ex2 extends Example {
    
    public Ex2() {
        System.out.println("This is sub class 02");
    }
    
    public static void main(String[] args) {
        Ex2 obj = new Ex2();
       
    }
    
}