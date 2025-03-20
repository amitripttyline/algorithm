package v2.arrays;

class Palindrome {
    public static boolean isPalindrome(int x) {
        String s = x + "";
        String rev = "";
        for(int i=0; i< s.length(); i++){
            rev = s.charAt(i) + rev;
        }
        System.out.println(rev + "_______"+ s);
        return (s.equals(rev));
    }

    public static void main(String[] args) {
        boolean x = isPalindrome(121);
        System.out.println(x);
    }
}