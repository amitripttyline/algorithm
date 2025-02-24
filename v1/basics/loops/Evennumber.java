// Print all even numbers till n.


package v1.basics.loops;

import java.util.Scanner;

public class Evennumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input upto what number u want even number:");
        int n = sc.nextInt();
        for (int i =0; i<=n ; i=i+2){
            System.out.println(i);
        }
    }
    
}
