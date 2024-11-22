package com.mycompany.assignments;

import java.util.Scanner;

public class Assignments extends PrimeNum {
    public static void main(String[] args) {
        System.out.println("This program check prime number");
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the number : ");
        PrimeNum num = new PrimeNum();
        num.setX(scan.nextInt());
        if (num.isY()==true){
            System.out.println("the number is prime number ");
        }
        else
            System.out.println("the number is not prime number ");
 
    }
}
