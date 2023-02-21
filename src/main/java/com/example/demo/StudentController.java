package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("/")
	public String homepage() {
		return "Welcome to student List";
	}
	
	@GetMapping("/list")
	public List<student> getList(){
		List<student> detailsList=new ArrayList<>();
		detailsList.add(new student(1,"xxxx",23));
		detailsList.add(new student (2,"yyyy",3));
		detailsList.add(new student (3,"ZZZZ",25));
		return detailsList;
	}

}
