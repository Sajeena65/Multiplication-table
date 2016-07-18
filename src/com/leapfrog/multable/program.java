/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.multable;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      int x,y,i;
      Scanner in = new Scanner(System.in);
      System.out.println("Enter an integer to print it's multiplication table:");
      x= in.nextInt();
      System.out.println("Enter the range of the multiplication table:");
      y= in.nextInt();
      System.out.println("Multiplication table is :-");
 
      for ( i = 1 ; i<= y ; i++ )
         System.out.println(x+"*"+i+" = "+(x*i));
       
    }
    
}
