package com.bptn.course._02_scanner;

//Import the Scanner library
import java.util.Scanner;

public class NegNumbers {
public static void main(String[] args) {
   // Type your code here 
   Scanner scanner = new Scanner(System.in);

   int number = scanner.nextInt();
   String result = "";

   if(number > 0){
     result = "positive";
   } else if (number < 0){
     result = "negative";
   } else {
     result = "equal to zero";
   }

   System.out.println("The number is "+result+".");

   scanner.close();
}

}