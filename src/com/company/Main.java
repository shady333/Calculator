package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // create a scanner so we can read the command-line input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter some for start");
        while (!scanner.next().equals("exit")) {
            System.out.print("Enter operotion: add, sub, mult, div ");
            String operation = scanner.next();

            System.out.print("Enter first number: ");

            int first_numb = scanner.nextInt();
            while (first_numb > 20 || first_numb < -20) {
                System.out.print("The number must be in the range -20 to 20. Reenter plese number: ");
                first_numb = scanner.nextInt();
            }

            System.out.print("Enter second number: ");

            int second_numb = scanner.nextInt();
            while (second_numb > 20 || second_numb < -20) {
                System.out.print("The number must be in the range -20 to 20. Reenter plese number: ");
                second_numb = scanner.nextInt();
            }
            int res = 0;


            switch (operation) {
                case "add":
                    res = first_numb + second_numb;
                    break;
                case "sub":
                    res = first_numb - second_numb;
                    break;
                case "mult":
                    res = first_numb * second_numb;
                    break;
                case "mod":
                    res = first_numb%second_numb;
                    break;
            }


                System.out.println(String.format("Result of operation is %d,  For exit enter 'exit', or somesing for continue", res));
        }
    }
}
