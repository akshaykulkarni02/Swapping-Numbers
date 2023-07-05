package com.akshay.allprograms.swappingtwonumbers;

import java.util.Scanner;

public class SwappingTwoNumbers
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of Number 1: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter Value of number 2: ");
        int number2 = scanner.nextInt();

        int number3;

        number3 = number1;
        number1 = number2;
        number2 = number3;

        System.out.println("The Value of Number 1 = " + number1);
        System.out.println("The Value of Number 2 = " + number2);

    }
}
