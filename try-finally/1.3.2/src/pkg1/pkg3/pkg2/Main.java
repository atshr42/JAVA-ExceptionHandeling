/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.pkg3.pkg2;

import java.util.Scanner;

/**
 *
 * @author aashish
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int  a,b;
               double c;
       Scanner input = new Scanner(System.in);      
       System.out.println("Enter the value of two numbers to perform Division");
       a = input.nextInt();
       b = input.nextInt();
       try{
           c = (a/b);
           System.out.println(c + " is the Result");
       }
       finally{
           System.out.println("Dividing operation has  been performed");
       }
        
    }
    
}
