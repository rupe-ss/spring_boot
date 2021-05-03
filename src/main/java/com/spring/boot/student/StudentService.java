package com.spring.boot.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getstudents(){
        return studentRepository.findAll();

        /*return Arrays.asList(
                new Student(
                        1L,
                        "Rupesh",
                        "rupesh@gmail.com",
                        LocalDate.of(2001, Month.MAY,24),
                        23)
        );*/
    }
}
