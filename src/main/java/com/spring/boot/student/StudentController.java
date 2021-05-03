package com.spring.boot.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping
    public List<Student> hello(){
        return Arrays.asList(
                new Student(
                        1L,
                        "Rupesh",
                        "rupesh@gmail.com",
                        LocalDate.of(2001, Month.MAY,24),
                        23)
        );
    }
}
