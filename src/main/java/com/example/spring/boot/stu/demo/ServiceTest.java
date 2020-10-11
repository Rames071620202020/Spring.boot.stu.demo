package com.example.spring.boot.stu.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceTest {
		//field based dependency injection.
	@Autowired
	private StudentEmail studentEmail;

	@PostConstruct
	public void testMessage() {
		studentEmail.message(" ");
	}
}