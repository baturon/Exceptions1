package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.SortedMap;

public class BuiltinExceptions {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a: ");
        int a=0;
        try {
            a=scanner.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Error, enter an integer number");
        }

    }
    static void processArithmeticExceptions(){
        //Деление на ноль
        int a=1, b;
        try {
            b = a / 0;
        }
        catch (ArithmeticException e){
            System.out.println("Деление на ноль");
        }
    }
}
