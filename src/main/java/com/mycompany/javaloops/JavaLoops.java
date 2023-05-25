/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaloops;

import java.util.Scanner;

/**
 *
 * @author stepa
 */
public class JavaLoops {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Loops");
        int age = 22;
        if (age >= 18) {
        System.out.println("Osoba je punoletna");
        } else {
        System.out.println("Osoba je maloletna");
        }
       System.out.println("Koliko imate godina ") ; 
       
        Scanner in = new Scanner(System.in);
        int personAge = in.nextInt();
        System.out.println("Unesli ste broj: " + personAge);
        
        if(personAge <=0 && personAge > 150) {
        System.out.println("Invalid");
        } else if(personAge <=5 ) {
        System.out.println("Beba");
        } else if(personAge <=11 ) {
        System.out.println("Kid");
        } else if(personAge <=17 ) {
        System.out.println("Teen");
        } else if(personAge >=18 ) {
        System.out.println("Adult");
        }
        // 0-2 beba
        // 3-10 dete
        // 11-17 tinejdzer
        // 18+ odrasla osoba
    }
}
