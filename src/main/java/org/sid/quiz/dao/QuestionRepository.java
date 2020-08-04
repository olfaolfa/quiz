package org.sid.quiz.dao;

import org.sid.quiz.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestResource
public interface QuestionRepository extends JpaRepository<Question,Long> {
}
