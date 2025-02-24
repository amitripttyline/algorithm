package v1.Searching;

public class smallestletter {
    public static void main(String[] args) {
        char[] letters = {'e', 'j', 'l', 'm', 'p', 'x', 'z'};
        char target = 'o';
        char result = ceilingbs(letters, target);
        System.out.println(result);
    }

    // return the index of smaller letter >= target(upar wala)
    public static char ceilingbs(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2; // finding the middle element, also might be possible that (start + end ) exceeds the range so we took in fraction and all
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[start % arr.length];
    }
}
