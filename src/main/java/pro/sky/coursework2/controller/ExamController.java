package pro.sky.coursework2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.coursework2.interfaces.ExaminerService;
import pro.sky.coursework2.model.Question;

import java.util.Collection;

@RestController
public class ExamController {

    ExaminerService service;

    public ExamController(ExaminerService service) {
        this.service = service;
    }

    @GetMapping("examiner/getQuestions")
    public Collection<Question> getQuestions(@RequestParam int amount) {
        return service.getQuestions(amount);
    }

}
