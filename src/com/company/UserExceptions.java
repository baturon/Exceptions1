package com.company;

import java.util.Scanner;

public class UserExceptions {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number from 1 to 9" );
        int a = scanner.nextInt();
        try {
            validateNumber(a);
            EvenNumber( a);
        } catch (FromOneToNineException e) {
            e.printStackTrace();
        }

    }

    static void validateNumber(int a) throws FromOneToNineException{
        if(a<1|| a>9) throw new FromOneToNineException("from 1 to 9");
    }
    static void EvenNumber(int a) throws FromOneToNineException {
        if(a%2!=0) throw new FromOneToNineException("not even");
    }
}

class FromOneToNineException extends Exception{

    public FromOneToNineException(String message) {
        super(message);
    }
}