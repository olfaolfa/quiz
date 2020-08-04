

INSERT INTO question (id_question,question_value, answer) VALUES
  (1,'JAVA is OOP', 'yes'),
  (2,'Interface can contain non abstract methods ', 'no' ),
  (3,'JAVA allow multiple heritance ', 'yes');

  INSERT INTO proposition (id_proposition,proposition, id_question) VALUES
    (1,'yes', 1),
    (2,'no', 1),
    (3,'yes', 2),
    (4,'no', 2),
    (5,'yes', 3),
    (6,'no', 3)

   ;
