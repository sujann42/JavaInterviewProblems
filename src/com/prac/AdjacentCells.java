package com.prac;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AdjacentCells {
    public static void main(String[] args) {

    }

    public static List<Integer> cellCompete(int[] states, int days) {
        List<Integer> lists = new LinkedList<>();
        int first = states[0];
        if (states[1] == 0) {
            lists.add(0);
        } else {
            lists.add(1);
        }
        int last = states[states.length - 1];
        for (int i = 1; i < states.length - 1; i++) {
            if ((states[i - 1] == 0) && ((states[i + 1] == 0)) || (states[i - 1] == 1) && ((states[i + 1] == 1))) {
                lists.add(0);
            } else {
                lists.add(1);
            }

        }
        if (states[states.length - 2] == 0) {
            lists.add(0);
        } else {
            lists.add(1);
        }
        return lists;
    }
}
