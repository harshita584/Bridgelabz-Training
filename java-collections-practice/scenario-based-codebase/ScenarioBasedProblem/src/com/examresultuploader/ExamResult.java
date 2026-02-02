package com.examresultuploader;

public class ExamResult<T> {
    private T examType;

    public ExamResult(T examType) {
        this.examType = examType;
    }

    public T getExamType() {
        return examType;
    }
}
