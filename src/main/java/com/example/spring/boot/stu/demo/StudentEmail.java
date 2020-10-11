package com.example.spring.boot.stu.demo;

import org.springframework.stereotype.Service;

@Service
public class StudentEmail {
	public void message(String msg) {
		System.out.println("Hello! This is Student email service; good afternoon.");
	}

}
