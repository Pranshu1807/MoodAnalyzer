package com.example;

import java.util.Arrays;

public class MoodAnalyser {
    public String analyseMood(String msg) {
        msg = msg.toLowerCase();
        String words[] = msg.split(" ");
        boolean check = Arrays.asList(words).contains("sad");
        if (check)
            return "SAD";
        return "HAPPY";
    }
}
