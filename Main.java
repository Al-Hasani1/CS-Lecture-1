package com.arzero12.mavenproject1;

// This is a comment, comments get ignored by the compiler. Comments begin with a double slash
import java.util.Scanner; // Import the Scanner class, the scanner gets input.

public class Main { // Class declaration, classnames must match filename,

    public static void main(String[] args) {
        System.out.println("Hello World!"); // Print a message to the commandline.
        System.out.println(1 + 4);          // Prints 5
        System.out.println("1 + 4");        // Prints 1 + 4
        int a = 2;                          // int declaration with name a
        int b = 3;                          // int declaration with name b
        
        System.out.println(a + b);          // Prints 5
        
        Scanner input = new Scanner(System.in); // Declare a new scanner
        
        a = input.nextInt();
        System.out.print("Enter a number: ");// Writes to the commandline without starting a new line.
        System.out.println(a);               // Print a after input, if a is not a number, you will get a runtime error.
        
        System.out.println(calc(3, 7));         // 10
        
        
        
    }
    
    public static int calc(int number1, int number2){ // Bonus: Function declaration.
        // This is a function that takes two ints and returns a new int.
        return number1 + number2;
    }
}
