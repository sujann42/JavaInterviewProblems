package com.prac;

public class LongestPalindromeInString {
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandFromMiddle(s, i, i);
            System.out.println("Length of len1 is: "+ len1);
            int len2 = expandFromMiddle(s, i, i + 1);
            System.out.println("Length of len2 is: "+ len2);

            int maxx = Math.max(len1, len2);
            System.out.println("Max is: "+ maxx);

            if (maxx > (end - start)) {
                start = i - ((maxx - 1) / 2);
                System.out.println("Start is: "+start);
                end = i + (maxx / 2);
                System.out.println("End is: "+end);
            }
        }
        return s.substring(start, end + 1);
    }

    public static int expandFromMiddle(String s, int left, int right) {
        if (s == null || left > right) {
            return 0;
        }
        while ((left >= 0 && right < s.length()) && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
