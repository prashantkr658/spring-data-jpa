package com.prashant.springdatajpa.repository;

import com.prashant.springdatajpa.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    StudentRepository studentRepository;

    @Test
    public void saveStudent(){
        Student student = Student.builder()
                .emailId("pkprashant@gmail.com")
                .firstName("Prashant")
                .lastName("Kumar")
                .guardianName("Rahul")
                .guardianEmail("rahul@gmail.com")
                .guardianMobile("9878999965")
                .build();
        studentRepository.save(student);
    }

    @Test
    public void getAllStudents(){
        List<Student> studentList = studentRepository.findAll();
        System.out.println(studentList);
    }

    @Test
    public void getStudentByFirstName(){
        List<Student> students = studentRepository.findByFirstName("Prashant");
        System.out.println(students);
    }
}