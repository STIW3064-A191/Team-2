package com.mycompany.team2_systemcomponentdevelopment;

import java.util.Arrays;
import java.util.Scanner;

public class ComponentB2 {

    private static char[] vowel(String input) {
        //function to display vowel
        return input.replaceAll("[^A-Za-z]+", "").replaceAll("[^AEIOUaeiou]", "").toCharArray();
    }

    private static char[] consonant(String input) {
        //function to display consonant
        return input.replaceAll("[^A-Za-z]+", "").replaceAll("[AEIOUaeiou]", "").toCharArray();
    }

    // method to be call through composition
    public void B() {

        System.out.print("Input: ");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        //to display all the output
        System.out.println("Output:");
        System.out.println("Vowel " + Arrays.toString(vowel(input)));
        System.out.println("Consonant " + Arrays.toString(consonant(input)));
       
    }
    
}
