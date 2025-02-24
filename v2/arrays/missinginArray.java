package v2.arrays;

public class missinginArray {

  public static void main(String[] args) {
    int arr[] = {1,2,3,4,6};

    System.out.println(findMissingNumberInArray(arr));
    
    
  }

  static int findMissingNumberInArray(int[] arr) {
    int n = arr.length + 1;
    int sum =  (n * (n+1))/2; // use AP sum formula
    for(int num: arr){
        sum -= num;
    }
    return sum;
  }
    
}

