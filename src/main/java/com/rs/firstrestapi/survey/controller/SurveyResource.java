package com.rs.firstrestapi.survey.controller;

import com.rs.firstrestapi.survey.model.Survey;
import com.rs.firstrestapi.survey.service.SurveyService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

/**
 * created by rs 7/17/2025.
 */

@RestController
public class SurveyResource {

    private SurveyService surveyService;

    public SurveyResource(SurveyService surveyService) {
        super();
        this.surveyService = surveyService;
    }

    // /surveys => survey
    @RequestMapping(value = "/surveys")
    public List<Survey> retrieveAllSurvey(){
        return surveyService.retrieveAllSurvey();
    }

    // /surveys/{surveyId} => survey
    @RequestMapping(value = "/surveys/{surveyId}")
    public Survey retrieveSurveyById(@PathVariable String surveyId){
        Survey survey = surveyService.retrieveSurveyById(surveyId);
        if(survey == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return survey;
    }




}


