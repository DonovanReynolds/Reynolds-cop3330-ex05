package org.example;

import java.util.Scanner;

/*
 *   UCF COP 3330 Fall 2021 Assignment 5 Solution
 *   Copyright 2021 Donovan Reynolds
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the first number?");
        String firstNumberString = input.nextLine();
        System.out.println("What is the second number?");
        String secondNumberString = input.nextLine();

        int num1 = Integer.parseInt(firstNumberString);
        int num2 = Integer.parseInt(secondNumberString);

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double quotient = (double)num1 / num2;

        String sumText = String.format("%d + %d = %d\n",num1,num2,sum);
        String difText = String.format("%d - %d = %d\n",num1,num2,difference);
        String productText = String.format("%d * %d = %d\n",num1,num2,product);
        String quotientText = String.format("%d / %d = %.210f\n",num1,num2,quotient);

        System.out.println(sumText + difText + productText + quotientText);
    }
}
