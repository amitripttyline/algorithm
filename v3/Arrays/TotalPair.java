package v3.Arrays;

// total pairs = n(n-1)/2

public class TotalPair {

    public static void tp(int arr[]){
        int count = 0;
        for(int i = 0 ; i< arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                count++;
                System.out.print("("+arr[i] + "," + arr[j]+ ")");
            }
            System.out.println();
        }
        System.out.println("Total count: " + count);
    }
        
    public static void main(String[] args) {
        int arr[] = {2,4,5,33,22,44,55};
        tp(arr);// 7*6/2=21
    }
    
}
