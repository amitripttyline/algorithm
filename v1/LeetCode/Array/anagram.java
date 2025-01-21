// https://leetcode.com/problems/valid-anagram/solutions/5503473/242-valid-anagram/

import java.util.Arrays;

    public class anagram {
        class Solution {
        public boolean isAnagram(String s, String t) {
            char[] s1 = s.toCharArray();
            char[] t1 = t.toCharArray();
            System.out.println(s1 + "  " + t1);

            Arrays.sort(s1);
            Arrays.sort(t1);
            boolean flag = Arrays.equals(s1, t1);

            return flag;
        }
    }

    
}
