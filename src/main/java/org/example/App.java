package org.example;

import org.example.reverse.CompareStringByLength;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        /*Task1 task1 = new Task1("task1.txt");
        task1.reverseFile();
        Task2 task2 = new Task2(1234567890);
        task2.printInReverseOrder();*/
        List<String> listOfStrings = new ArrayList<>();
        try(BufferedReader fileReader = new BufferedReader(new FileReader("task1.txt"));){
            while (fileReader.ready()){
                listOfStrings.add(fileReader.readLine());
            }
        }
        listOfStrings = listOfStrings.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
        listOfStrings.forEach(System.out::println);
    }
}
