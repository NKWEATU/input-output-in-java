/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inputoutputfromusers;

import java.util.*;
/**
 *
 * @author USER
 */
public class InputOutputFromUsers {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num1 = sc.nextInt();
        System.out.println("number value is :" + num1);
        
        Scanner jk = new Scanner(System.in);
        System.out.println("enter another number");
        int num2 = jk.nextInt();
        System.out.println("second number is :" + num2);
      
    
        
        int sum = num1 + num2 ;
        System.out.println("the answer is :" + sum);
        
        
         Scanner bf = new Scanner(System.in);
        System.out.println("Enter your name :");
               String name = bf.nextLine();
        System.out.println("my name is :" + name);
        
        Scanner atm = new Scanner(System.in);
        System.out.println("if you want to make withdrawals, please input your pin");
        int pin =atm.nextInt();
        System.out.println("your pin is :" + pin + "which is correct");
        
        System.out.println("CONVERSION FROM ONE DATA TYPE TO ANOTHER");
        System.out.println("CONVERSION FROM INTEGER TO DOUBLE");
        int number = 14;
        double doublenumber = number;
        System.out.println("double value is : " + doublenumber);
        
        System.out.println("CONVERSION FROM ONE DOUBLE TO INTEGER");
        System.out.println("INTEGER HAS 4BYTES WHILE DOUBLE HAS 8BYTES, CONVERTING FROM SMALLER BYTES TO BIGGER ONES IS EASY, BUT FROM BIGGER BYTES TO SMALLER ONES INVOLVES TYPECASTING EXPLICITLY");
        
        int intnumber = (int) doublenumber;
        System.out.println("int value is :" + intnumber);
        
        
        Scanner xy = new Scanner(System.in);
        System.out.println("Enter Num1");
        int Num1 = xy.nextInt();
        System.out.println("you entered :" + Num1);
        
        Scanner ty = new Scanner(System.in);
        System.out.println("Enter Num2");
        int Num2 = ty.nextInt();
        System.out.println("You entered :" + Num2);
        
        Scanner df = new Scanner(System.in);
        System.out.println("Enter Num3");
        int Num3 = df.nextInt();
        System.out.println("You entered :" + Num3);
        
        int Sum = Num1 + Num2 + Num3;
        System.out.println("Your answer is :" + Sum +  " Thank you for using this app");
        
        
    }
}
