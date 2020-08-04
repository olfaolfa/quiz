package org.sid.quiz.controller;

import org.sid.quiz.dao.PropositionRepository;
import org.sid.quiz.entities.Proposition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PropositionRestController {

    @Autowired
    public PropositionRepository propositionRepository;

    @RequestMapping(path = "/propositions" , method = RequestMethod.GET)
    public List<Proposition> getAllPropositions(){
        return propositionRepository.findAll();
    }

    @RequestMapping(path = "/addProposition",method = RequestMethod.POST)
    public Proposition addProposition(@RequestBody Proposition proposition) {
        return propositionRepository.save(proposition);
    }

    @RequestMapping(path = "/proposition/{id}" , method = RequestMethod.GET)
    public Proposition getProposition(@PathVariable(name = "id") Long id){
        return propositionRepository.findById(id).get();
    }
}
