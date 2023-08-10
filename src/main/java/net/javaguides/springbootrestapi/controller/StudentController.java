package net.javaguides.springbootrestapi.controller;

import net.javaguides.springbootrestapi.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    @GetMapping("student")
    public Student getStudent()
    {
        Student student = new Student(
                1,
                "Ramesh",
                "Fadatare"
        );
        return student;
    }
    @GetMapping("students")
    public List<Student> getStudentList(){
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(1, "Ramesh", "Fadatare"));
        students.add(new Student(2, "Ramesh", "Deneme"));
        return students;
    }
}
