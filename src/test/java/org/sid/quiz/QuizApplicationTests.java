package org.sid.quiz;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.sid.quiz.entities.Proposition;
import org.sid.quiz.entities.Question;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.not;

@SpringBootTest
class QuizApplicationTests {

	@Test
	void contextLoads() throws JsonProcessingException {
		Question question= new Question(Long.valueOf(1),"JAVA is OOP","yes");
		Proposition proposition= new Proposition(Long.valueOf(1),"yes",question);
		question.getPropositions().add(proposition);
		String result= new ObjectMapper().writeValueAsString(proposition);
		assertThat(result,containsString("yes"));
		assertThat(result,containsString("JAVA is OOP"));
		assertThat(result,not(containsString("propositions")));
	}

}
