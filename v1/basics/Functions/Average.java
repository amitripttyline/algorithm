// Enter 3 numbers from the user & make a function to print their average.

package Functions;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("The average of no is:" + average(a, b, c));  

    }

    public static int average(int a, int b, int c) {
        int avg = (a + b + c)/3;
        return avg;
    }
    
}
