package org.sid.quiz.controller;

import org.sid.quiz.dao.QuestionRepository;
import org.sid.quiz.entities.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuestionRestController {

    @Autowired
    public QuestionRepository questionRepository;

    @RequestMapping(path = "/all" , method = RequestMethod.GET)
    public List<Question> getAllQuestions(){
        return questionRepository.findAll();
    }

    @RequestMapping(path = "/addQuestion",method = RequestMethod.POST)
    public Question addTask(@RequestBody Question question) {
        return questionRepository.save(question);
    }

    @RequestMapping(path = "/question/{id}" , method = RequestMethod.GET)
    public Question getQuestion(@PathVariable(name = "id") Long id){
        return questionRepository.findById(id).get();
    }
}
