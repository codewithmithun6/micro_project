package com.question.services;

import com.question.entities.Question;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface QuestionService {


    // create
    Question create(@RequestBody Question question);

    // get all question
    List<Question> getAll();

    Question getOne(Long id);

    List<Question> getQuestionsOfQuiz(Long quizId);


}