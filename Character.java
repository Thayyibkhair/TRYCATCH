/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.character;

/**
 *
 * @author Thaiyyib
 */
public class Character {

    String[] character;

    Character(){
        character = new String[]{"Wanderer", "Zhongli", "Venti", "Raiden", "Nahida", "Furina"};
    }
    
    public static void main(String[] args) {
        System.out.println("Genshin Impact");

        Character character = new Character();
        
        try {
            System.out.println(character.character[5]);
    }catch (Exception ex) {
            System.out.println("Number is not valid");
        }   
    }
}

    

