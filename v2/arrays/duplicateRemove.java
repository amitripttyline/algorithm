package v2.arrays;

import java.util.Arrays;

public class duplicateRemove {
	public static void main(String[] args) {
		int arr[] = {6,6,6,1, 1, 2, 2, 3, 4, 5};
		System.out.println(Arrays.toString(removeDuplicates(arr)));
	}

	public static int[] removeDuplicates(int[] arr) {
		// int length = arr.length;
		// int dup_count = 0;
		// for(int i=1; i<length; i++){
		// 		if(arr[i-1] == arr[i]){
		// 				arr[i] = Integer.MIN_VALUE;
		// 				dup_count++;
		// 		}
		// }  
		
		// int uniq_arr[] = new int[length-dup_count];
		// int j =0;
		// for(int i=0; i<length; i++){
		// 		if (arr[i] != Integer.MIN_VALUE){
		// 				uniq_arr[j] = arr[i];
		// 				j++;
		// 		}
		// }
		
		// return uniq_arr;

		//m2
		int n = arr.length;
		int[] uniqueArray = new int[n];
		int index = 0;

		for (int i = 0; i < n; i++) {
			boolean isDuplicate = false;
			for (int j = i + 1; j < n; j++) {
					if (arr[i] == arr[j]) {
							isDuplicate = true;
							break;
					}
			}
			if (!isDuplicate) {
					uniqueArray[index++] = arr[i];
			}
		}

		return Arrays.copyOf(uniqueArray, index);
		
	}
    
}
