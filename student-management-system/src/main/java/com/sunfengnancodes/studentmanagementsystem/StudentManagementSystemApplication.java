package com.sunfengnancodes.studentmanagementsystem;

import com.sunfengnancodes.studentmanagementsystem.entity.Student;
import com.sunfengnancodes.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {

		Student student1 = new Student("Fengnan", "Sun", "sfn@gmail.com");
		Student student2 = new Student("Yue", "Cheng", "cy@gmail.com");
		Student student3 = new Student("Sonia", "Sun", "soniaSun@gmail.com");
		studentRepository.save(student1);
		studentRepository.save(student2);
		studentRepository.save(student3);

	}
}
