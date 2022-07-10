package com.tms.lesson10;

public class Task1 {
    //Проверить, является ли введённая строка палиндромом, т.е. читается одинаково в обоих направлениях

        public static void main(String[] args) {

            String palindrome = "Казак";
            StringBuilder builder = new StringBuilder(palindrome);
            builder.reverse();
            String result = builder.toString();

            if(palindrome.equalsIgnoreCase(result)) {
                System.out.println("Это палиндромная строка");

            } else {
                System.out.println("Это не палиндромная строка");
            }
        }
    }
