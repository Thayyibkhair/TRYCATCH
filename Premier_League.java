/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.premier_league;

import com.mycompany.premier_league.Premier_League.Liverpool.ManCity;

/**
 *
 * @author Thaiyyib
 */
public class Premier_League {
    public static void main(String[] args) {
        team call = new Liverpool ();
        call.play();
        call = new ManCity();
        call.play();
        
    }
    static class team {
        public void play(){
            System.out.println ("I am team from Premier League");
        }
    }
    static class Liverpool extends team {
        public void play(){
            super.play();
            System.out.println("I am Liverpool the best Club in England");      
        }
    static class ManCity extends team{
        public void play(){
            super.play();
            System.out.println("I am ManCity Solid club in EPL");
        }
    }
  }
}
