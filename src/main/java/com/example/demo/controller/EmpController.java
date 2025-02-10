package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.EmpEntity;
import com.example.demo.repo.EmpRepo;

@RestController
public class EmpController {
	
	@Autowired
	private EmpRepo emprepo;
	
	@GetMapping("/hello")
	public String welMeth(){
		return "hello"; 
	}
	
	@PostMapping("/hello1")
	public ResponseEntity<String> welMeth1(@RequestBody EmpEntity entity ){
		emprepo.save(entity);
		return new ResponseEntity<>("emp data created",HttpStatus.CREATED); 
	}
	
}
