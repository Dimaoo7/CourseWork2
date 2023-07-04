package pro.sky.coursework2.controller;

import org.springframework.web.bind.annotation.*;
import pro.sky.coursework2.interfaces.QuestionService;
import pro.sky.coursework2.model.Question;

import java.util.Collection;

@RestController
@RequestMapping("/exam")
public class JavaController {

    private final QuestionService service;

    public JavaController(QuestionService service) {
        this.service = service;
    }


    @GetMapping("/add")
    public String add(@RequestParam("question")String question, @RequestParam("answer")String answer){
        service.add(question, answer);
        return "Вопрос добавлен\n" +
                question + "\n" +
                answer + "\n";
    }


    @GetMapping("/remove")
    public String remove(@RequestParam("question")String question, @RequestParam("answer")String answer){
        service.remove(question, answer);
        return "вопрос удален\n" +
                question + "\n" +
                answer + "\n";
    }

    @GetMapping("java")
    public Collection<Question> getAllQuestions() {
        return service.getAll();
    }
}
