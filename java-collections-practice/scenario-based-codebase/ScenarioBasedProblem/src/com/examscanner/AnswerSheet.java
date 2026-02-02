package com.examscanner;

public abstract class AnswerSheet {
    public char[] answerKey;

    public AnswerSheet(char[] answerKey) {
        this.answerKey = answerKey;
    }

    public int evaluate(char[] answers) {
        int score = 0;
        int len = Math.min(answerKey.length, answers.length);

        for(int i = 0; i < len; i++) {
            if(answerKey[i] == answers[i]) {
                score++;
            }
        }
        return score;
    }
}

