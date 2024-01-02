package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

    MoodAnalyser moodAnalyser = null;

    @Test
    public void sadTest() {
        moodAnalyser = new MoodAnalyser();
        assertEquals("SAD", moodAnalyser.analyseMood("I am in Sad Mood"));
    }

    @Test
    public void happyTest() {
        moodAnalyser = new MoodAnalyser();
        assertEquals("HAPPY", moodAnalyser.analyseMood("I am in Happy Mood"));
    }
}