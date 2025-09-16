package org.example;

import jakarta.persistence.Embeddable;

@Embeddable
public class Marks {

    private int examMark;
    private int assignmentMark;
    private int quizMark;

    public Marks() {
    }

    public Marks(int examMark, int assignmentMark, int quizMark) {
        this.examMark = examMark;
        this.assignmentMark = assignmentMark;
        this.quizMark = quizMark;
    }

    // getters & setters

    public int getExamMark() {
        return examMark;
    }

    public void setExamMark(int examMark) {
        this.examMark = examMark;
    }

    public int getAssignmentMark() {
        return assignmentMark;
    }

    public void setAssignmentMark(int assignmentMark) {
        this.assignmentMark = assignmentMark;
    }

    public int getQuizMark() {
        return quizMark;
    }

    public void setQuizMark(int quizMark) {
        this.quizMark = quizMark;
    }

    @Override
    public String toString() {
        return "Marks{" +
                "examMark=" + examMark +
                ", assignmentMark=" + assignmentMark +
                ", quizMark=" + quizMark +
                '}';
    }
}
