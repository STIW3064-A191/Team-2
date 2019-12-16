package com.mycompany.team2_systemcomponentdevelopment;

import java.util.Scanner;

public class ComponentC2 {

   // method to be call through composition
    public void C() {
        Scanner inp = new Scanner(System.in);
        System.out.print("Input: ");
        String s = inp.nextLine();//read input string

        System.out.print("String: ");
        for (int i = 0; i < s.length(); i++) {//loop to cycle all single char in string
            char charAt2 = s.charAt(i);//loop all char from string
            if (Character.isLetter(charAt2)) {//alphabet check
                System.out.print(charAt2);
                //System.out.print("\n");
            }
        }
        
    }
}
