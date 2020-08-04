package org.sid.quiz.entities;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;


import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

@SpringBootTest
class EntitiesRelationTest {

    @Test
    public void givenBidirectionRelation_whenUsingJsonIgnore_thenCorrect() throws JsonProcessingException{
    Question question= new Question(Long.valueOf(1),"JAVA is OOP","yes");
    Proposition proposition= new Proposition(Long.valueOf(1),"yes",question);
    question.getPropositions().add(proposition);
    String result= new ObjectMapper().writeValueAsString(proposition);
    assertThat(result,containsString("yes"));
    assertThat(result,containsString("JAVA is OOP"));
    assertThat(result,not(containsString("propositions")));


    }
}