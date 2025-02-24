package v2.arrays;

public class sumof2dDiagonalElem {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(sumDiagonalElements(arr));
        
    }
    public static int sumDiagonalElements(int[][] array) {
         // approach -1
        // int sum = 0; 
        // for(int i=0; i < array.length;i ++){
        //     for(int j=0; j< array.length; j++){
        //         if(i == j){
        //             sum += array[i][j];
        //         }
        //     }
        // }
        // return sum;

        
        // approach - 2
        int sum = 0;
        int numRows = array.length;
 
        for (int i = 0; i < numRows; i++) {
            sum += array[i][i];
        }
 
        return sum;

  }
    
}