package com.company_HomeWork_Task_3;



import java.io.*;
import java.util.*;

public class MainHasMap  {


    public static void main(String[] args)  throws IOException {
        System.out.println("Написати метод, який зчитує дані з файлу у HashMap, ключем якої є номер рядку файлу, а value - це текст у рядку файлу. Записати у інший файл тільки ті значення HashMap, ключі яких є степенем 2. Використати перехоплення виключення ситуацій - (файлу не існує, ітд)");
       Map<Integer, String> IndextoLineMap = readFromFile();
       System.out.println(IndextoLineMap);


       ArrayList<String> resulte = new ArrayList<>();
       for(Map.Entry<Integer, String> IntengerStringEntry: IndextoLineMap.entrySet()){
           Integer number = IntengerStringEntry.getKey();
           if(number > 0 && (number & number - 1) == 0){
               resulte.add(IntengerStringEntry.getValue());
           }
       }
      FileReaderWriter.writeArrayToFile( "Tast.resulte" , resulte);
    }

    public static Map<Integer, String> readFromFile () throws FileNotFoundException {
        // all lines from file to list
        ArrayList<String> strings = FileReaderWriter.readFileToArrayList("Task");
        Map<Integer, String> map = new HashMap<>();
        //
        for (int i = 0; i < strings.size(); i++) {
            int index = 1 + i;
            map.put(index, strings.get(i));
        }
        return map;
    }




}