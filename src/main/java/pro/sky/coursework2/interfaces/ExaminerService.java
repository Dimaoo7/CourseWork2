package pro.sky.coursework2.interfaces;


import pro.sky.coursework2.model.Question;

import java.util.Collection;

public interface ExaminerService {

     Collection<Question> getQuestions(int amount);
}
