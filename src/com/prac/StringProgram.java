package com.prac;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringProgram {
    public static void main(String[] args) {
        String str = "My cat is name is tiger but a tiger is not name a cat";
        Map<String, Integer> mappy = getWordCount(str);
        printMap(mappy);
    }
    public static Map<String, Integer> getWordCount(String str){
        String[] myStrArr = str.split(" ");
        Map<String, Integer> mapp = new LinkedHashMap<>();
        for (int i = 0; i < myStrArr.length; i++) {
            if(mapp.containsKey(myStrArr[i])){
                int value = mapp.get(myStrArr[i]);
                mapp.put(myStrArr[i], value+1);
            }
            else {
                mapp.put(myStrArr[i], 1);
            }
        }


        return mapp;
    }

    private static void printMap(Map<String, Integer> mapp) {
        for(Map.Entry<String, Integer> ent: mapp.entrySet()){

                System.out.printf("%-7s %-1d\n",ent.getKey(), ent.getValue());
            }
        }
    }

