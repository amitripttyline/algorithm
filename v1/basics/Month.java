// Ask the user to enter the number of the month & print the name of the month. For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.
import java.util.*;
public class Month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month number:");
        int a = sc.nextInt();
        switch(a){
            case 1:System.out.println("january");
            break;
            case 2:System.out.println("Feb");
            break;
            case 3:System.out.println("March");
            break;
            case 4:System.out.println("April");
            break;
            case 5:System.out.println("may");
            break;
            case 6:System.out.println("june");
            break;
            case 7:System.out.println("july");
            break;
            case 8:System.out.println("aug");
            break;
            case 9:System.out.println("sept");
            break;
            case 10:System.out.println("oct");
            break;
            case 11:System.out.println("nov");
            break;
            case 12:System.out.println("dec");
            break;
            default:System.out.println("No month selected");
        }

        
    }
    
}
