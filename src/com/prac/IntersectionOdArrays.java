package com.prac;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOdArrays {
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        int[] a = intersection(nums1, nums2);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a);
        }
    }

    public static int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set = new HashSet<>();
        int[] newArr = new int[nums1.length];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
          set.add(nums1[i]);
        }
        System.out.println("Set is: "+set);
        for (int i = 0; i < nums2.length; i++) {
            if(set.contains(nums2[i])){
                list.add(nums2[i]);
                set.remove(nums2[i]);
            }else {
                continue;
            }
        }
        System.out.println("Set is: "+set);
        for (int i = 0; i < list.size(); i++) {
            newArr[i] = list.get(i);
        }
        return newArr;

    }
}
