/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.movie;

/**
 *
 * @author Thaiyyib
 */
public class Movie {

    public static void main(String[] args) {
        try {
            String[] Movie = {"Oppenheimer", "Barbie", "Detective Conan", "Mission Impossible"};
            System.out.println(Movie[4]);
        } 
        catch (Exception ex) {
            System.out.println("Number is not valid");
        }   
    }
}
