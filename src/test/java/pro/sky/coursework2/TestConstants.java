package pro.sky.coursework2;

import pro.sky.coursework2.model.Question;

import java.util.HashSet;
import java.util.Set;

public class TestConstants {

    public static final Question QUESTION1 = new Question("Question 1", "Answer 1");
    public static final Question QUESTION2 = new Question("Question 2", "Answer 2");
    public static final Question QUESTION3 = new Question("Question 3", "Answer 3");
    public static final Question QUESTION4 = new Question("Question 4", "Answer 4");
    public static final Question QUESTION5 = new Question("Question 5", "Answer 5");

    public static final Set<Object> EMPTY_SET = new HashSet<>();

    public static final Set<Question> FULL_SET = new HashSet<>(Set.of(
            new Question(QUESTION1.getQuestion(), QUESTION1.getAnswer()),
            new Question(QUESTION2.getQuestion(), QUESTION2.getAnswer()),
            new Question(QUESTION3.getQuestion(), QUESTION3.getAnswer()),
            new Question(QUESTION4.getQuestion(), QUESTION4.getAnswer()),
            new Question(QUESTION5.getQuestion(), QUESTION5.getAnswer())
    ));
}
