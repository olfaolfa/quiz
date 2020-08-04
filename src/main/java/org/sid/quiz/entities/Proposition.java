package org.sid.quiz.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Proposition {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long idProposition;
    public String proposition ;
    @ManyToOne
    @JoinColumn( name="idQuestion",nullable = false)
    //@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Question question;
}
