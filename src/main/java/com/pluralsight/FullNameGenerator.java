package com.pluralsight;

import java.util.Scanner;

public class FullNameGenerator {
    public static void main(String[] args) {
        Scanner namescanner = new Scanner(System.in);
        //Prompt user for first name
        System.out.println("First Name: ");
        String firstNameInput = namescanner.nextLine();
        //Prompt for middle name
        System.out.println("Middle Name: ");
        String middleNameInput = namescanner.nextLine();
        //Prompt user for last name
        System.out.println("Your Last Name: ");
        String lastNameInput = namescanner.nextLine();
        //Prompt for suffix
        System.out.println("Suffix: ");
        String suffixInput = namescanner.nextLine();
        //Print full name
        String fullName = (firstNameInput + " " + middleNameInput + " " + lastNameInput + " " + suffixInput);
        fullName = fullName.trim().toUpperCase();
        System.out.println("Full Name: " + fullName);



    }

}
