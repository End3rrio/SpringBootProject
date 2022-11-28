package it.mirea.springServer6.model.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentDao {
    @Autowired
    private StudentRepository repository;

    public Student save(Student student){
        return repository.save(student);
    }

    public List<Student> getAllStudents(){
        List<Student> students = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(student -> {
                    students.add(student);
                });
        return students;
    }

    public void delete(Student student){
        repository.delete(student);
    }
}
