package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Possible calculations: ");
        System.out.println("(A)dd");
        System.out.println("(S)ubract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");
        System.out.println("Enter the value based on a given prompt for calculation: ");

        char UserInput = scanner.next().charAt(0);
        int answer;

        if(UserInput == 'A')
        { //Do addition
            answer = firstNumber + secondNumber;
        }
        else if (UserInput == 'S')
        {
            //Subtract
            answer = firstNumber - secondNumber;
        }
        else if(UserInput == 'M')
        {
            //Do multiplication
            answer = firstNumber * secondNumber;
        }
        else
        {
            //Do divide
            answer = secondNumber/firstNumber;
        }
        System.out.println("After calculation, your answer is : "+ answer);

    }
}
