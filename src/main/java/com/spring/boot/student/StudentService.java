package com.spring.boot.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getstudents(){
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
