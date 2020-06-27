package com.prac;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountingRepitionOfWords {
    public static void main(String[] args) {
        String str = "A Coke a My cat is name is tiger but a tiger is not name a cat";
        System.out.println(str);
        System.out.println(str.toLowerCase());
        System.out.println(getWordCount(str));
    }
    public static String getWordCount(String str){
        String[] myStrArr = str.toLowerCase().split(" ");
        Map<String, Integer> mapp = new TreeMap<>();
        for (int i = 0; i < myStrArr.length; i++) {
            if(mapp.containsKey(myStrArr[i])){
                int value = mapp.get(myStrArr[i]);
                mapp.put(myStrArr[i], value+1);
            }
            else {
                mapp.put(myStrArr[i], 1);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(Map.Entry<String, Integer> entry: mapp.entrySet()){
            sb.append(entry.getKey()+" "+entry.getValue()+"\n");
        }

        return sb.toString();
    }

}

/*
* public static String getWordCount(String str){
        String[] myStrArr = str.split(" ");
        Map<String, Integer> mapp = new LinkedHashMap<>();
        countWordsIntoMap(myStrArr, mapp);

        StringBuilder sb = getStringBuilder(mapp);

        return sb.toString();
    }

    private static StringBuilder getStringBuilder(Map<String, Integer> mapp) {
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<String, Integer> entry: mapp.entrySet()){
            sb.append(entry.getKey()+" "+entry.getValue()+"\n");
        }
        return sb;
    }

    private static void countWordsIntoMap(String[] myStrArr, Map<String, Integer> mapp) {
        for (String s : myStrArr) {
            if (mapp.containsKey(s)) {
                int value = mapp.get(s);
                mapp.put(s, value + 1);
            } else {
                mapp.put(s, 1);
            }
        }
    }*/
