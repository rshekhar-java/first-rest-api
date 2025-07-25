package com.rs.firstrestapi.survey.service;

import com.rs.firstrestapi.survey.model.Question;
import com.rs.firstrestapi.survey.model.Survey;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * created by rs 7/17/2025.
 * all business logic will be here in this service for survey functionality
 */
@Service
public class SurveyService {

    private static List<Survey> surveys = new ArrayList<Survey>();

    static {
        Question question1 = new Question("Question1",
                "Most Popular Cloud Platform Today", Arrays.asList(
                "AWS", "Azure", "Google Cloud", "Oracle Cloud"), "AWS");
        Question question2 = new Question("Question2",
                "Fastest Growing Cloud Platform", Arrays.asList(
                "AWS", "Azure", "Google Cloud", "Oracle Cloud"), "Google Cloud");
        Question question3 = new Question("Question3",
                "Most Popular DevOps Tool", Arrays.asList(
                "Kubernetes", "Docker", "Terraform", "Azure DevOps"), "Kubernetes");

        List<Question> questions = new ArrayList<>(Arrays.asList(question1,
                question2, question3));

        Survey survey = new Survey("Survey1", "My Favorite Survey",
                "Description of the Survey", questions);

        surveys.add(survey);

    }

    public List<Survey> retrieveAllSurvey() {
        return surveys;
    }

    public Survey retrieveSurveyById(String surveyId) {
        Predicate<? super Survey> predicate = survey -> survey.getId().equalsIgnoreCase(surveyId);
        Optional<Survey> optionalSurvey = surveys.stream().filter(predicate).findFirst();
        if(optionalSurvey.isEmpty()) return null;

        //Todo autogenerated method stubs
        return optionalSurvey.get();
    }

    public List<Question> retrieveAllSurveyQuestions(String surveyId) {
        Survey survey = retrieveSurveyById(surveyId);
        if(survey == null) return null;

        //TODO Auto - generated method stub
        return survey.getQuestions();

    }

    public Question retrieveSpeceficSurveyQuestions(String surveyId,String questionId) {
        List<Question> surveyQuestions = retrieveAllSurveyQuestions(surveyId);
        if(surveyQuestions == null) return null;
        Optional<Question> optionalQuestion = surveyQuestions.stream().filter(predicateQuestion -> predicateQuestion.getId().equalsIgnoreCase(questionId)).findFirst();
        if(optionalQuestion.isEmpty()) return null;
        return optionalQuestion.get();
    }


}
