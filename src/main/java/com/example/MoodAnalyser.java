package com.example;

import java.util.Arrays;

public class MoodAnalyser {

    String msg = "";

    public MoodAnalyser() {
    }

    public MoodAnalyser(String msg) {
        this.msg = msg;
    }

    public String analyseMood() throws MoodAnalysisException {
        if (this.msg == null) {
            throw new MoodAnalysisException(MoodAnalysisExceptionType.NullStringException, "String is Null");
        }
        if (this.msg.isEmpty()) {
            throw new MoodAnalysisException(MoodAnalysisExceptionType.EmptyStringException, "String is Empty");
        }
        this.msg = this.msg.toLowerCase();
        String words[] = this.msg.split(" ");
        boolean check = Arrays.asList(words).contains("sad");
        if (check)
            return "SAD";
        return "HAPPY";

    }
}

enum MoodAnalysisExceptionType {
    NullStringException,
    EmptyStringException
}

class MoodAnalysisException extends Exception {
    public MoodAnalysisExceptionType exceptionType;

    public MoodAnalysisException(MoodAnalysisExceptionType exceptionType, String message) {
        super(message);
        this.exceptionType = exceptionType;
    }

    public MoodAnalysisExceptionType getExceptionType() {
        return exceptionType;
    }
}
