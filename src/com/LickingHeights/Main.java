package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int pickedNumber;
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        int userNumber;

        pickedNumber = (int) (Math.random() * 100);
        System.out.println(pickedNumber);
        System.out.println("I am thinking of a number between 1-100. Can you guess it?");
        userNumber= keyboard.nextInt();
        if (userNumber==pickedNumber) {
                System.out.println("You got it right");

            }
            while(userNumber>pickedNumber||userNumber<pickedNumber){
            if(userNumber>pickedNumber){
                System.out.println("My number is less than yours");
            }
            if(userNumber<pickedNumber){
                System.out.println("My number is greater than yours");
            }
            }

            }}
