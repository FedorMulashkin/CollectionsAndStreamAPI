package org.example.reverse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Task2 {
    private int number;;

    public Task2() {
    }

    public Task2(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public void printInReverseOrder(){
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> numberArr = new ArrayList<>();
        int temp = number;
        while(temp != 0){
            numberArr.add(temp%10);
            temp /=10;
        }
        for (int i = numberArr.size() - 1; i >= 0; i--) {
            stack.push(numberArr.get(i));
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
