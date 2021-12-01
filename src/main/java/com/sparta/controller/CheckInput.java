package com.sparta.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.sparta.SortingDriver.logger;

public class CheckInput {

    public static int checkInputMenuForException(int numberOfOptions){

        Scanner scan = new Scanner(System.in);
        int n = 0;
        boolean correct = false;

        while(!correct){
            try{
                n = scan.nextInt();
                if(n > numberOfOptions) {
                    logger.error("Wrong input for the menu!" + " | Entered: " + n);
                    throw new IndexOutOfBoundsException();
                }
                correct = true;
            } catch ( InputMismatchException | IndexOutOfBoundsException i ){
                System.out.println("Wrong input!");
                scan.nextLine();
            }
        }

        return n;
    }
}
