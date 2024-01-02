package com.example;

import java.util.Arrays;

public class MoodAnalyser {
    public String analyseMood(String msg) {
        String words[] = msg.split(" ");
        boolean check = Arrays.asList(words).contains("Sad");
        if (check)
            return "SAD";
        return "HAPPY";
    }
}
