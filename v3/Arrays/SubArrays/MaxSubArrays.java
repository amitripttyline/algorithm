package v3.Arrays.SubArrays;

public class MaxSubArrays {

    public static void allSub(int arr[]){
        int ts = 0; // total subarray = n(n+1)/2
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i< arr.length; i++){
            for(int j =i; j< arr.length; j++){
                int sum = 0;
                for(int k = i; k<= j; k++){
                    System.out.print(arr[k] + " ");
                    sum += arr[k];
                }
                ts++;
                if(sum > max){
                    max = sum;
                }
                if(sum< min){
                    min = sum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarray: " + ts);// (4*3/2=10)
        System.out.println("min sum: " + min + " max: " + max);


    }
    public static void main(String[] args) {
        int arr [] = {3,5,6,9};
        allSub(arr);
        
    }
    
}
