package v2.arrays;

public class createArray {

    public static void main(String[] args) {
        int arrInt[] = new int[5];
         arrInt[0] = 9;
         arrInt[1] = 9;
         arrInt[2] = 9;
         arrInt[3] = 9;
        for(int nums: arrInt){
            System.out.println(nums);
        }
        String arrStrr[] =new String[5];
        String arrStr[] = {"w","ww", "klk", "pop"};
        for(String str: arrStr){
            System.out.println(str + " ");
        }
         System.out.print(arrStrr[1]);
    }
}
