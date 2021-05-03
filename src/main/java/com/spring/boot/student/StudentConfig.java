package com.spring.boot.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.Arrays;

import static java.time.Month.MAY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student rupesh = new Student(
                    "Rupesh",
                    "rupesh@gmail.com",
                    LocalDate.of(2001, MAY, 24),
                    23
            );

            Student atish = new Student(
                    "Atish",
                    "atish@gmail.com",
                    LocalDate.of(2003, MAY, 24),
                    23
            );

            repository.saveAll(Arrays.asList(rupesh, atish));
        };
    }
}
