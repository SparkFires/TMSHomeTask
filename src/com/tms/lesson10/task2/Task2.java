package com.tms.lesson10.task2;

import java.util.Scanner;

import static com.tms.lesson10.task2.Convert.convert;

public class Task2 {
        public static class realization {
            public static void main(String[] args) {

                System.out.println("Please enter a number to be converted to roman numerals: ");
                Scanner scan = new Scanner(System.in);
                int number = scan.nextInt();
                String realization = "";
                if (number < 0 || number > 3999) {
                    System.out.println("This number cannot be converted");
                } else {
                    System.out.println("The number you input, converted into roman numerals is: " + realization);
                    System.out.println(convert(number));
                }
            }
        }
    }
