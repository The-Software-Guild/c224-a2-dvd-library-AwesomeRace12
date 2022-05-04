/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.util.*;
/**
 *
 * @author aakar
 */
public class UserIOImpl implements UserIO {
    Scanner myScanner = new Scanner(System.in);

    
    public void print(String message) {
        System.out.println(message);
    }

    public int readInt(String prompt, int min, int max) {
        System.out.println(prompt);
        String stringNumber = myScanner.nextLine();
        int number = Integer.parseInt(stringNumber);

        while (number < min || number > max) {

            if (number < min || number > max) {
                System.out.println("Please input the correct number");
                stringNumber = myScanner.nextLine();
                number = Integer.parseInt(stringNumber);
            }
        }
        return number;
    }


    
    public String readString(String prompt) {
        System.out.println(prompt);
        String input = myScanner.nextLine();

        return input;
    }
}
