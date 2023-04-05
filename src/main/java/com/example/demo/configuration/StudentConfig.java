package com.example.demo.configuration;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student arsen = new Student(
                    "Arsen",
                    "arsen.m@gmail.com",
                    LocalDate.of(1995, Month.FEBRUARY,13));
            Student ars = new Student(
                    "Ars",
                    "ars.melikyan@gmail.com",
                    LocalDate.of(1995, Month.FEBRUARY,13));
            repository.saveAll(
                    List.of(arsen, ars));
        };
    }
}
