package com.mycompany.team2_systemcomponentdevelopment;

import java.util.Arrays;
import java.util.Scanner;

public class ComponentB2 {

    private static char[] vowel(String input) {
        return input.replaceAll("[^A-Za-z]+", "").replaceAll("[^AEIOUaeiou]", "").toCharArray();
    }

    private static char[] consonant(String input) {
        return input.replaceAll("[^A-Za-z]+", "").replaceAll("[AEIOUaeiou]", "").toCharArray();
    }

    public void B() {

        System.out.print("Input: ");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println("Output:");
        System.out.println("Vowel " + Arrays.toString(vowel(input)));
        System.out.println("Consonant " + Arrays.toString(consonant(input)));
       
    }
    
}
