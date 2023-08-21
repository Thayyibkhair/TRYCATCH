/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jnc_burger;

/**
 *
 * @author Thaiyyib
 */
public class JNC_Burger {

    int food;
    
    public JNC_Burger(){
        System.out.println("Welcome to JNC");
        food = 10;
    }
    public static void main(String[] args) {
        
        JNC_Burger Burger = new JNC_Burger();
        
        System.out.println(Burger.food +" "+ "menu");

    }
}
