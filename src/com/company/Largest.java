package com.company;

import java.util.Scanner;

public class Largest {

    public static void displayMenu() {
        System.out.println("Please enter number between 0 - 100: ");
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        do {
            displayMenu();
            num = sc.nextInt();

            if (num > 0 && num < 100) {
                int i;
                for(i=0; i<5; i++){
                    num = num +1;

                    System.out.println(num);
                }

            }
            else {
                System.out.println("invalid");
            }
        } while (true);
    }
}
