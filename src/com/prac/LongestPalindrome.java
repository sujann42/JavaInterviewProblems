package com.prac;

public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abab"));
        String str = "byayaq";
        System.out.print("Longest Palindrome is: ");
        System.out.println(longestPalindrome(str));

    }

    public static String longestPalindrome(String s) {
        if (s.length() == 0) {
            return "";
        }
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {

                String myStr = s.substring(i, j+1);
                //System.out.println(myStr);
                if (isPalindrome(myStr) == true && result.length() < myStr.length()) {
                    result = myStr;
                }
            }
        }

        return result;
    }

    private static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String newStr2 = sb.toString();
        if (str.equals(newStr2)) {
            return true;
        } else {
            return false;
        }
    }
}
