package com.prac;

import java.util.*;

public class ReoderLinesAmazon {
    public List<String> reorderLines(String helpText,
                                     List<String> wordsToExclude)
    {
            List<String> finalRes = new ArrayList<>();
            String regex = "[?._,'@! _]";
            StringTokenizer strToken = new StringTokenizer(helpText, regex);

            Map<String, Integer> mapp = new HashMap<>();
            String tempStr = null;
            while(strToken.hasMoreTokens()){
                tempStr = strToken.nextToken().toLowerCase();
                if(!wordsToExclude.contains(tempStr)) {
                    if (mapp.containsKey(tempStr)) {
                        mapp.put(tempStr, mapp.get(tempStr) + 1);
                    } else {
                        mapp.put(tempStr, 1);
                    }
                }
            }

            int maxValInMap = Collections.max(mapp.values());

            for(Map.Entry<String, Integer> entry: mapp.entrySet()){
                if(entry.getValue() == maxValInMap && !wordsToExclude.contains(entry.getKey())){
                    finalRes.add(entry.getKey());
                }
            }
            return finalRes;
    }

    public static void main(String[] args) {

    }
}
