package com.bptn.course._02_scanner;

import java.util.Scanner;

public class ASCIIExample {
    public static void main(String[] args) {
        // Fill in the code below
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        int ascii = c;
        System.out.println("The ASCII value of " + c + " is: " + ascii);
        scanner.close();
    }
}