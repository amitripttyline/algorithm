// Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
// If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
// If they enter 0 then stop.
// If he/ she scores :
// Marks >=90 -> print “This is Good”
// 89 >= Marks >= 60 -> print “This is also Good”
// 59 >= Marks >= 0 -> print “This is Good as well”
// 	Because marks don’t matter but our effort does.
// (Hint : use do-while loop but think & understand why)

package loops;

import java.util.Scanner;

public class MarksSheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter i/p 1 or 0");
        int input;
        do {
            System.out.print("Enter your marks:");
            int marks = sc.nextInt();
            if (marks > -90) {
                System.out.println("This is good.");
            } else if (89 >= marks && marks >= 60) {
                System.out.println("This is also good.");
            } else if (59 >= marks && marks >= 0) {
                System.out.println("This is good as well");
            } else {
                System.out.println("Invalid marks.");
            }

            System.out.println("enter valid input => 1 to continue and 0 to break:");
            input = sc.nextInt();

        } while (input == 1);

    }

}
