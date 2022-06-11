package org.example;

import org.example.reverse.Task1;
import org.example.reverse.Task2;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        Task1 task1 = new Task1("task1.txt");
        task1.reverseFile();
        Task2 task2 = new Task2(1234567890);
        task2.printInReverseOrder();
    }
}
