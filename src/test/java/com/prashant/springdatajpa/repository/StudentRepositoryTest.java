package com.prashant.springdatajpa.repository;

import com.prashant.springdatajpa.entity.Guardian;
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
                /*.guardianName("Rahul")
                .guardianEmail("rahul@gmail.com")
                .guardianMobile("9878999965")*/
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

    @Test
    public void getStudentByFirstNameContaining(){
        List<Student> students = studentRepository.findByFirstNameContaining("sh");
        System.out.println(students);
    }

    @Test
    public void saveStudentWithGuardian(){
        Guardian guardian = Guardian.builder()
                .name("Santosh")
                .email("santosh@gmail.com")
                .mobile("97898798999")
                .build();

        Student student = Student.builder()
                .firstName("Mohit")
                .lastName("Kukreti")
                .emailId("mohit@gmail.com")
                .guardian(guardian)
                .build();

        studentRepository.save(student);
    }
}