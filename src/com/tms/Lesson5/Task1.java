package com.tms.Lesson5;
import java.util.Arrays;
public class Task1 {
        public static void main(String[] args) {
            int [] num = {1,2,3,4,5};
            int temp;
            for (int i = 0; i < num.length-1; i++) {
                temp = num[i];
                num[i] = num[i+1];
                num[i+1] = temp;
            }
            for (int num2 : num) {
                System.out.print(num2);
            }
        }
    }
