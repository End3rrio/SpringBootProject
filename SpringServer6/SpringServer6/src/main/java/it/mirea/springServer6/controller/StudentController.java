package it.mirea.springServer6.controller;

import it.mirea.springServer6.model.student.Student;
import it.mirea.springServer6.model.student.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentDao studentDao;

    @GetMapping("/student/getAll")
    public List<Student> getAllStudents(){
        return studentDao.getAllStudents();
    }

    @PostMapping("/student/save")
    public Student save(@RequestBody Student student){
        return studentDao.save(student);
    }
}
