package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

    MoodAnalyser moodAnalyser = null;

    @Test
    public void sadTest() {
        moodAnalyser = new MoodAnalyser("I am in sad Mood");
        assertEquals("SAD", moodAnalyser.analyseMood());
    }

    @Test
    public void happyTest() {
        moodAnalyser = new MoodAnalyser("I am in Happy Mood");
        assertEquals("HAPPY", moodAnalyser.analyseMood());
    }
}
