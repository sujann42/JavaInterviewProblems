package com.prac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Chess {


    public static String getColorofBoard(String line) {
        String result = "";
        if (line.length() > 2 || line.length() < 1) {
            return "Error";
        }
        int first = line.charAt(0);
        int second = line.charAt(1);

        if ((first % 2 != 0) && (second % 2 == 0) || (first % 2 == 0) && (second % 2 != 0)) {
            result += "White";
        } else {
            result += "Black";
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(getColorofBoard(line));
        }
    }
}
