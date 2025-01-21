// Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
// 	1 : + (Addition) a + b
// 2 : - (Subtraction) a - b
// 3 : * (Multiplication) a * b
// 4 : / (Division) a / b
// 5 : % (Modulo or remainder) a % b
// Calculate the result according to the operation given and display it to the user.


import java.util.*;

class Calculator {
    public static void main(String args[]){
      //print hello
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the first number:");
      int a = sc.nextInt();
      System.out.println("Enter the second number:");
      int b = sc.nextInt();
      System.out.println("Enter the operator:");
      int operation = sc.nextInt();
      System.out.println("Calculater result:");
      switch(operation){
        case 1: System.out.println(a+b);
        break;
        case 2: System.out.println(a-b);
        break;
        case 3: System.out.println(a*b);
        break;
        case 4: System.out.println(a/b);
        break;
        case 5: System.out.println(a%b);
        break;
        default: System.out.println("No input");
      }

    }
}