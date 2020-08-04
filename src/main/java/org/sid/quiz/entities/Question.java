package org.sid.quiz.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
@ToString
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NonNull
    public Long idQuestion;
    @NonNull
    public String questionValue ;
    @NonNull
    public String answer;
    @OneToMany (targetEntity=Proposition.class, mappedBy="question" )
    @JsonIgnore
    private Set<Proposition> propositions = new HashSet<>();
}
