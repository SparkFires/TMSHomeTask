package com.tms.Lesson5;

public class Task3 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {1, 2, 3}};

        for (int i = 0; i < array.length; i++) {

            int[] array2 = (int[]) array[i];
            for (int x : array2) {
                System.out.print(x);
            }
        }
    }
}
