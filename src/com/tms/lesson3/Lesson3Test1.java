package com.tms.lesson3;

import java.util.Scanner;

public class Lesson3Test1 {
    public static void main(String [] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the number ");
        int sum = 0;
        while (console.hasNextInt()) {
            int a = console.nextInt();
            sum+=a;
        }
        System.out.println(sum);
    }
}
