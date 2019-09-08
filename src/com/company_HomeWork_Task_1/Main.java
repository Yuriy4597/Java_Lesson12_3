package com.company_HomeWork_Task_1;


import java.util.*;

public class Main {




    public static void main(String[] args) {
        System.out.println("Написати метод, який генерує випадкову колекцію стрічок, кожна з яких є стрічкою, що містить від 6 до 15 символів. Кількість стрічок в колекції передається, як параметр методу.");

        System.out.println(task1(5));
    }


    public static Collection<String> task1(int count) {
        String alphabet = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        List<String> strings = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            // from 6 to 15
            int randomStringLength = new Random().nextInt(9) + 6;
            // array of random chars { A, 3, 4, g, f, 8}
            char[] chars = new char[randomStringLength];
            for (int j = 0; j < randomStringLength; j++) {
                // random index of a letter in #alphabet
                int randomIndex = random.nextInt(alphabet.length() - 1);
                // random character by #randomIndex
                char randomChar = alphabet.charAt(randomIndex);
                chars[j] = randomChar;
            }
            strings.add(new String(chars));
        }
        return strings;
    }
}
