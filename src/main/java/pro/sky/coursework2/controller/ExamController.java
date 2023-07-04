package pro.sky.coursework2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.coursework2.interfaces.ExaminerService;

import java.util.List;


@RestController
public class ExamController {

    ExaminerService service;

    public ExamController(ExaminerService service) {
        this.service = service;
    }

    @GetMapping("/get/{amount}")
    public List<String> getQuestions(@PathVariable("amount") int amount){
        return service.getQuestions(amount) ;
    }

}
