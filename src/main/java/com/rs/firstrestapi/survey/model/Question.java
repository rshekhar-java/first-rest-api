package com.rs.firstrestapi.survey.model;

import java.util.List;

/**
 * created by rs 7/17/2025.
 */
public class Question {
    private String id;
    private String description;
    private List<String> option;
    private String correctAnswer;

    public Question(String id, String description, List<String> option, String correctAnswer) {
        super();
        this.id = id;
        this.description = description;
        this.option = option;
        this.correctAnswer = correctAnswer;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getOption() {
        return option;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", option=" + option +
                ", correctAnswer='" + correctAnswer + '\'' +
                '}';
    }
}
