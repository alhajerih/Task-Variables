//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Variables
    String firstName="John";
    String lastName="Doe";
    int age=24;
    int amount=178;
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);
        System.out.println(amount);

// Booleans
        boolean married= false;

        //string Interpolation
        double amount = 20;
        String deposit="Deposit";
        String withdraw="Withdraw";
        amount=50;
        System.out.println("The amount is "+amount+"KD");
        System.out.println("Would you like to "+deposit+" or "+withdraw+" the amount?");

//Arithmetic spice
        int amount = 5;
        System.out.println(amount+" plus "+amount+" makes "+(amount+amount));

        //String Methods
        String fullName="John doe";
        String nameParts[]= fullName.split(" ");
        String last=nameParts[1];
        System.out.println("My name is "+nameParts[0]+" and my last name length is "+last.length());

        System.out.println(last.startsWith("d"));

        }
    }
