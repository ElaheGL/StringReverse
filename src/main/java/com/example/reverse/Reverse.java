package com.example.reverse;

import javax.swing.*;

public class Reverse {
    public static void main(String[] args){
        String name1 = JOptionPane.showInputDialog(null,"Enter the First name");
        String name2 = JOptionPane.showInputDialog(null,"Enter the second name");
        String Answer = reverse(name1,name2);
        JOptionPane.showMessageDialog(null,Answer);
    }
    private static String reverse(String Name1,String Name2){
        String result1 =  new StringBuilder(Name1).reverse().toString();
        String result2 = new StringBuilder(Name2).reverse().toString();
        return result1+" "+result2;
    }
}
