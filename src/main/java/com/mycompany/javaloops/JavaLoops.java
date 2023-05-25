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
//        System.out.println("Loops");
//        int age = 22;
//        if (age >= 18) {
//        System.out.println("Osoba je punoletna");
//        } else {
//        System.out.println("Osoba je maloletna");
//        }
//       System.out.println("Koliko imate godina ") ; 
//       
//        Scanner in = new Scanner(System.in);
//        int personAge = in.nextInt();
//        System.out.println("Unesli ste broj: " + personAge);
//        
//        if(personAge <=0 || personAge > 150) {
//        System.out.println("Uneli ste pogresnu vrednost");
//        } else if(personAge <=5 ) {
//        System.out.println("Beba");
//        } else if(personAge <=11 ) {
//        System.out.println("Kid");
//        } else if(personAge <=17 ) {
//        System.out.println("Teen");
//        } else {
//        System.out.println("Adult");
//        }
        
//        System.out.println("-------------------------------");
//        
//        System.out.println("Unesite broj dana u nedelji (1-7): ");
//        Scanner in2 = new Scanner(System.in);
//        int dayNumber = in2.nextInt();
//        
//        // System.out.print("Uneli ste broj: " + dayNumber);
//        
//        String day;
//        
//        switch (dayNumber) {
//            case 1:
//                day = "Ponedeljak";
//                break;
//            case 2:
//                day = "Utorak";
//                break;
//            case 3:
//                day = "Sreda";
//                break;
//            case 4:
//                day = "Cetvrtak";
//                break;
//             case 5:
//                day = "Petak";
//                break;
//            case 6:
//                day = "Subota";
//                break;
//            case 7:
//                day = "Nedelja";
//                break;
//            default:
//                day = "Uneli ste pogresan broj";
//                break;
//        }
//        
//        System.out.print("Dan je: " + day);

//        System.out.println("While loop example");
//        int x = 5;
//        while (x < 10) {
//            System.out.println(x);
//            x++;
//        }
//        while (x > 0) {
//            System.out.println(x);
//            x--;
//        }
//        
//        System.out.println("Trenutna vrednost broja x je:" + x);
//        
//        while (x > 5) {
//            System.out.println(x);
//            x++;
//        }
//        
//        System.out.println("Do while loop example");
//        
//        int y = 20;
//        do {
//            System.out.println(y);
//            y = y + 2;
//           }while (y < 40);
           

//            System.out.println("For loop example");
            
//            for (int i = 0; i < 10; i++) {
//            System.out.println("*");
//        }
//            for (int i = 99; i >= 90; i--) {
//            System.out.println("*");
//            }
//              for (int i = 0; i < 10; i++) {
//              System.out.println("* * * * * * * * *");
//             }
//              for (int i = 1; i <= 10; i++) {
//              System.out.println(i + ",1 " + i + ",2 " + i + ",3 ");
//             }   
//              for (int i = 1; i <= 10; i++) {
//                  for (int j = 1; j < 10; j++) {
//                      System.out.println(i + "," + j);
//                  }
//              }
//              for (int i = 1; i <= 20; i++) {
//                  for (int j = 1; j <= 20; j++) {
//                      System.out.print(" * ");
//
//                  }
//                  System.out.println();
//              }
              
              for (int i = 1; i <= 20; i++) {
                  for (int j = 1; j < i; j++) {
                      System.out.print(" * ");

                  }
                  System.out.println();
              }
    }
    
}