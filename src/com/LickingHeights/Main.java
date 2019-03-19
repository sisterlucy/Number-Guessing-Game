package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int pickedNumber;
	Scanner keyboard;
	String username;
	keyboard=new Scanner(System.in);
	int userNumber;

	pickedNumber= (int)(Math.random()*100);
	System.out.println(pickedNumber);
	System.out.println("I am thinking of a number between 1-100. Can you guess it?");;
        userNumber=keyboard.nextInt();
    if (userNumber<pickedNumber);{
        System.out.println("My picked number is greater than yours");

        }
        userNumber=keyboard.nextInt();
    if (userNumber>pickedNumber);
        {
            System.out.println("My picked number is less than yours");

        }

    }
}
