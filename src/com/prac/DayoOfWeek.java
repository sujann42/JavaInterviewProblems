package com.prac;

import java.util.HashMap;
import java.util.Map;

public class DayoOfWeek {
    public static void main(String[] args) {
        System.out.println(solutions("Wed", 2));//"Fri"
        System.out.println(solutions("Sat", 23));//"Mon"

        System.out.println(solution(17));
    }

   

    public static String solutions(String S, int K){
        int temp= 0;
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Mon");
        map.put(2, "Tue");
        map.put(3, "Wed");
        map.put(4, "Thu");
        map.put(5, "Fri");
        map.put(6, "Sat");
        map.put(7, "Sun");



        if(S.equals("Mon")){
            temp += (1+K)%7;
        }
        if(S.equals("Tue")){
            temp += (2+K)%7;
        }
        if(S.equals("Wed")){
            temp += (3+K)%7;
        }
        if(S.equals("Thu")){
            temp += (4+K)%7;
        }
        if(S.equals("Fri")){
            temp += (5+K)%7;
        }
        if(S.equals("Sat")){
            temp += (6+K)%7;
        }
        if(S.equals("Sun")){
            temp += (7+K)%7;
        }

        return map.get(temp);
    }
}
