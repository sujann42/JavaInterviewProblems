package com.prac;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class GCD {
    public static void main(String[] args) {
        int[] arr = {24, 8, 10, 12, 4}; //4, 8, 10, 12, 24
        int n = 5;
        //System.out.println(generalizedGCD(n, arr));
        System.out.println(generalizedGCD(n, arr));
    }
    public static int findGcd(int a, int b)
    {
        if (a == 0)
            return b;
        return findGcd(b % a, a);
    }


    public static int generalizedGCD(int num, int[] arr)
    {
        int result = arr[0];
        for (int i = 1; i < num; i++){
            result = findGcd(arr[i], result);

            if(result == 1)
            {
                return 1;
            }
        }

        return result;
    }

    public static int generalizedGCDs(int num, int[] arr) {
        int result = 0;
        int temp = 0;
        Arrays.sort(arr);
        for (int i = 1; i < arr[arr.length - 1]; i++) {
            int divisor = i;
            for (int j = 0; j < arr.length; j++) {
                int dividend = arr[j];
                if (dividend % divisor == 0) {
                    temp = i;
                } else {
                    break;
                }
            }
            result = temp;
        }

        return result > 1 ? result : 1;
    }
}
