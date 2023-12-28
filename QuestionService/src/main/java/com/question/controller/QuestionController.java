package com.question.controller;

import com.question.entities.Question;
import com.question.services.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    private QuestionService questionService;

    // create
    @PostMapping
    public Question create(@RequestBody Question question){
        return questionService.create(question);
    }

    // get all question
    @GetMapping
    public List<Question> getAll(){
        return questionService.getAll();
    }

    // get one question
    @GetMapping("/{questionId}")
    public Question getOne(@PathVariable Long questionId){
        return  questionService.getOne(questionId);
    }

    // get all questions of specific quiz
    @GetMapping("quiz/{quizId}")
    public List<Question> getQuestionsOfQuiz(@PathVariable Long quizId){
        return questionService.getQuestionsOfQuiz(quizId);
    }
}
