package com.prac;

import java.util.*;
import java.util.List;
import java.util.Collections;

public class FindMissingNumber {

    public static void main(String[] args) {
        int A[] = {1, 3, 6, 4, 1, 2};
        System.out.println(solution(A));
        System.out.println(solutionArr(A));
    }

    public static int solution(int[] A) {
        List<Integer> list = new ArrayList<>();
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            list.add(A[i]);
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list); //1, 1, 2, 3, 4, 5, 6
        if(list.get(0)<1){
            return 1;
        }

        for (int i = 0; i < list.size() - 1; i++) {
            int num1 = list.get(i);
            int num2 = list.get(i + 1);
            if (num1 == num2 || num1 + 1 == num2) {
                result += 0;
            } else {
                result = num1 + 1;
            }
        }
        //System.out.println(list.get(list.size()-1));
        return result == 0 ? list.get(list.size() - 1) + 1 : result;

    }

    public static int solutionArr(int[] A) {
        int result = 0;
        printArr(A);
        Arrays.sort(A);
        printArr(A);

        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] == A[i + 1] ||
                    A[i] == A[i + 1] + 1) {
                continue;
            } else {
                result = A[i] + 1;
            }
        }

        return result;

    }

    private static void printArr(int[] A) {
        for (Integer i : A) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
