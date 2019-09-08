package com.company_HomeWork_Task_2;


import java.time.LocalDateTime;

public class Date {


    public static void main(String[] args) {

        System.out.println("Написати метод, який приймає параметром поточну дату та додає дні, місяці та рік до цієї дати. Усі ці значення передаються параметрами в метод теж.");

        LocalDateTime now = LocalDateTime.now();
        System.out.println("Local Date now: " + now);
        LocalDateTime modify = listModifyLocalDate(now, 5, 5, 5);
        System.out.println("\n"+"Local Date now: " + modify);



    }


    public static LocalDateTime listModifyLocalDate(LocalDateTime localDateTime, long years, long months, long days){
        LocalDateTime modifiedYears = localDateTime.plusYears(years);
        LocalDateTime modifiedMonths = modifiedYears.plusMonths(months);
        LocalDateTime modifiedDays = modifiedMonths.plusDays(days);
        return modifiedMonths;
    }


}
