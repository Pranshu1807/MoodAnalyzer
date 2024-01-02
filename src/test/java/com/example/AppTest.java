package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class AppTest {

    MoodAnalyser moodAnalyser = null;

    @Test
    public void sadTest() {
        moodAnalyser = new MoodAnalyser("I am in sad Mood");
        try {
            String mood = moodAnalyser.analyseMood();
            assertEquals("SAD", mood);
        } catch (MoodAnalysisException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void happyTest() {
        moodAnalyser = new MoodAnalyser("I am in Happy Mood");
        try {
            String mood = moodAnalyser.analyseMood();
            assertEquals("HAPPY", mood);
        } catch (MoodAnalysisException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void checkNUllTest() {
        moodAnalyser = new MoodAnalyser(null);
        try {
            moodAnalyser.analyseMood();
            fail("Expected a null string");
        } catch (MoodAnalysisException e) {
            if (e.getExceptionType() == MoodAnalysisExceptionType.NullStringException)
                assertEquals("String is Null", e.getMessage());
            else
                fail("Expected a null string but got an empty string");
        }
    }

    @Test
    public void checkEmptyTest() {
        moodAnalyser = new MoodAnalyser("");
        try {
            moodAnalyser.analyseMood();
            fail("Expected an empty string");
        } catch (MoodAnalysisException e) {
            if (e.getExceptionType() == MoodAnalysisExceptionType.EmptyStringException)
                assertEquals("String is Empty", e.getMessage());
            else
                fail("Expected an empty string but got null");
        }
    }
}