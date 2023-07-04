package pro.sky.coursework2.interfaces;

import pro.sky.coursework2.model.Question;

import java.util.Collection;

public interface QuestionService {

     Question getRandomQuestion();

     Question add(String question, String answer);

     void remove(String question, String answer);

     Collection<Question> getAll();


}
