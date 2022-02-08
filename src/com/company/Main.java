package com.company;

import java.time.LocalDate;
import java.util.Scanner;
public class Main {


    private static User newUser2;

    public static void main(String[] args) {
        Scanner appScanner = new Scanner(System.in);
        User newUser = new User();

        System.out.println("Enter first name:");
        String firstName = appScanner.next();
        newUser.setFirstName(firstName);

        System.out.println("Enter last name:");
        String lastName = appScanner.next();
        newUser.setLastName(lastName);

        System.out.println("Enter email:");
        String email = appScanner.next();
        newUser.setEmail(email);

        System.out.println("Enter contact number:");
        String contactNumber = appScanner.next();
        newUser.setContactNumber(contactNumber);

        LocalDate id = LocalDate.now();
        newUser.setId(firstName + id);





        User newUser2 = new User();

        System.out.println("Enter first name:");
        String firstName2 = appScanner.next();
        newUser2.setFirstName(firstName2);

        System.out.println("Enter last name:");
        String lastName2 = appScanner.next();
        newUser2.setLastName(lastName2);

        System.out.println("Enter email:");
        String email2 = appScanner.next();
        newUser2.setEmail(email2);

        System.out.println("Enter contact number:");
        String contactNumber2 = appScanner.next();
        newUser2.setContactNumber(contactNumber2);

        LocalDate id2 = LocalDate.now();
        newUser2.setId(firstName2 + id2);




        newUser.introduce(newUser.getFirstName(),newUser.getLastName());
        newUser.provideContact(newUser.getContactNumber(), newUser.getEmail(), newUser.getId());

        newUser2.introduce(newUser2.getFirstName(), newUser2.getLastName());
        newUser2.provideContact(newUser2.getContactNumber(), newUser2.getEmail(), newUser2.getId());


















    }
}
