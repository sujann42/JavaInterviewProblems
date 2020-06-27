package com.prac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LogFilesArrange {

    public List<String> reorderLines(int logFileSize, List<String> logLines)
    {

        List<String> dl = new ArrayList<>();
        List<String> ll = new ArrayList<>();
        for (String item : logLines) {
            if (item.split(" ")[1].charAt(0) < 'a') {
                dl.add(item);
            } else {
                ll.add(item);
            }
        }
        Collections.sort(ll, (a, b) -> {
            String[] string1 = a.split(" ");
            String[] string2 = b.split(" ");
            int len1 = string1.length;
            int len2 = string2.length;
            for (int i = 1; i < Math.min(len1, len2); i++) {
                if (!string1[i].equals(string2[i])) {
                    return string1[i].compareTo(string2[i]);
                }
            }
            return 0;
        });

        for (int i = 0; i < logFileSize; i++) {
            if (i < ll.size())
                logLines.add(ll.get(i));
            else {
                logLines.add(dl.get(i - ll.size()));
            }

        }
        return logLines;
    }
}
