package com.prashant.springdatajpa.repository;

import com.prashant.springdatajpa.entity.Course;
import com.prashant.springdatajpa.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class TeacherRepositoryTest {

    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public void saveTeacher(){
        Course course = Course.builder()
                .title("DSA")
                .credit(7)
                .build();

        Teacher teacher = Teacher.builder()
                .firstName("Josh")
                .lastName("Burner")
                .courses(List.of(course))
                .build();
        teacherRepository.save(teacher);
    }
}