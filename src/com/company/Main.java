package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // create a scanner so we can read the command-line input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Press any key to start");
        while (!scanner.next().equals("exit")) {
            System.out.print("Choose operation: add, sub, mult, div ");
            String operation = scanner.next();

            System.out.print("Enter first number: ");

            int first_numb = scanner.nextInt();
            //TODO extract method which will be used for number 1 and number 2
            while (first_numb > 20 || first_numb < -20) {
                System.out.print("The number must be in range from -20 to 20. Please enter correct number: ");
                first_numb = scanner.nextInt();
            }

            System.out.print("Enter second number: ");

            int second_numb = scanner.nextInt();
            while (second_numb > 20 || second_numb < -20) {
                System.out.print("The number must be in the range -20 to 20. Enter please number: ");
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

            //TODO add operation name into output
            System.out.println(String.format("Result of operation is %d,  For exit enter 'exit', or something for continue", res));
        }
    }
}
