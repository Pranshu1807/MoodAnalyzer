package com.example;

import java.util.Arrays;

public class MoodAnalyser {

    String msg = "";

    public MoodAnalyser() {
    }

    public MoodAnalyser(String msg) {
        this.msg = msg;
    }

    public String analyseMood() {
        this.msg = this.msg.toLowerCase();
        String words[] = this.msg.split(" ");
        boolean check = Arrays.asList(words).contains("sad");
        if (check)
            return "SAD";
        return "HAPPY";
    }

}
