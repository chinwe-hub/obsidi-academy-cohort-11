package com.bptn.course.factorial;

import java.util.Scanner;

class FactorialExample {  
    public static void main(String args[]) {  

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a whole number: ");
        int number = scanner.nextInt();
        
        // Initialize fact as 1 (multiplicative identity)
        long fact = 1;
        
        // Loop from the number down to 1
        for (int i = number; i >= 1; i--) {
            fact *= i;
        }
        
        // Output the final result
        System.out.println("Factorial of " + number + " is: " + fact);
        
        scanner.close();
    }
}


/*

Summary:

* What was new?: I had to implement the mathematical concept of factorials 
* using a decrementing for loop in Java and handling
* user input through the Scanner class.

* Issues encountered: An issue is initializing the factorial variable to 0 by mistake.
* Since we are multiplying, it must start at 1. Also, for very large numbers, a long data type can overflow.

* Future Reminder: I will remember to close the Scanner object to prevent memory leaks and ensure the loop starts
* at the user's number and decreases until it reaches 1 (i >= 1 and i--).
*/
