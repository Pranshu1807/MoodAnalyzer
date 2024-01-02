package com.example;

public class App {
    public static void main(String[] args) {

        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String str1 = "I am in Sad Mood";
        System.out.println("The mood in the sentence:" + str1 + " is " + moodAnalyser.analyseMood(str1));

        String str2 = "I am in Any Mood";
        System.out.println("The mood in the sentence:" + str2 + " is " + moodAnalyser.analyseMood(str2));

    }
}
