package it.mirea.springServer6;

import it.mirea.springServer6.model.student.Student;
import it.mirea.springServer6.model.student.StudentDao;
import it.mirea.springServer6.model.student.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringServer6ApplicationTests {

	@Autowired
	private StudentDao studentDao;

	@Test
	void addStudentTest() {
		addStudent("Toxa", "ItEngineer", "2nd");
		addStudent("Lexa", "ItSecurity", "3rd");
		addStudent("Aleksandr", "AndroidDeveloper", "4th");
	}
	private void addStudent(String name, String speciality, String year){
		Student student = new Student();
		student.setName(name);
		student.setSpeciality(speciality);
		student.setYear(year);
		studentDao.save(student);
	}

	//@Test
	void getAllStudentsAndDeleteThem(){
		List<Student> students = studentDao.getAllStudents();
		for(Student student: students){
			studentDao.delete(student);
		}
	}

}
