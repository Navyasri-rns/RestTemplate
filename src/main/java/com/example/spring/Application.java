package com.example.spring;

import com.example.spring.entity.Employee;
import com.example.spring.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application  {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

//	@Autowired
//	private EmpRepo empRepo;
//	@Override
	//public void run(String... args) throws Exception {
//		Employee emp = new Employee();
//
//		emp.setFirstName("Navyasri");
//		emp.setLastName("Edharapu");
//		emp.setEmailId("navya@gmail.com");
//		empRepo.save(emp);
//
//		emp.setFirstName("Chandu");
//		emp.setLastName("Honey");
//		emp.setEmailId("chandu@gmail.com");
//		empRepo.save(emp);


}
