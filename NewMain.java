
package com.mycompany.mavenproject1;

import java.util.Scanner;


public class NewMain {

   
    public static void main(String[] args) {
        
      Scanner entrada = new Scanner (System.in);
      int num1;
      int num2;
      System.out.println("mete el primer numero");
      num1 = entrada.nextInt();
        System.out.println("mete el segundo numero");
        num2 = entrada.nextInt();
        System.out.println("LA SUMA TOTAL ES " + (num1 + num2));
    }
    
}
