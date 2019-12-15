package com.mycompany.team2_systemcomponentdevelopment;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ComponentA2 A2 = new ComponentA2();
        ComponentB2 B2 = new ComponentB2();
        ComponentC2 C2 = new ComponentC2();

        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;

        int choice;
        while (true) {
            System.out.print("\n");
            System.out.print("Welcome to Numline\n");
            System.out.print("List of Function\n");
            System.out.print("1.) Check Palindrome Number\n");
            System.out.print("2.) Vowels and Consonants Listers\n");
            System.out.print("3). String Extractor\n");
            System.out.print("4). Exit\n");
            System.out.print("Please enter your choice:");
            choice = input.nextInt();
                    

            switch (choice) {
                
                case 1:
                    A2.A();
                    break;

                case 2:
                    B2.B();
                    break;

                case 3:
                    C2.C();
                    break;

                case 4:
                    System.out.println("Exiting Program...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("The is not valid Menu Option ! Please select another choice");
                    break;
            }
        }
    }
}
