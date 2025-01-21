// https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/


public class replaceElement {
    public int[] replaceElements(int[] arr) {
        int max=-1;
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]> max){
                int temp=max;
                max=arr[i];
                arr[i]=temp;
            }
            else
                arr[i]=max;
        }
        return arr;
    }
    
}
