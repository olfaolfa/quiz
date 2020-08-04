package org.sid.quiz.dao;

import org.sid.quiz.entities.Proposition;
import org.sid.quiz.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource
public interface PropositionRepository extends JpaRepository<Proposition,Long> {
}
