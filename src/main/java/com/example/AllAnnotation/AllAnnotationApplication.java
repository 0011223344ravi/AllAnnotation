package com.example.AllAnnotation;


import org.aspectj.weaver.ast.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RestController
public class AllAnnotationApplication {

	@Autowired
	private TestBean testBean;

	@GetMapping("/test")
	public void getDisplay(){
		testBean.display();

	}

	public static void main(String[] args) {
		SpringApplication.run(AllAnnotationApplication.class, args);
	}

}
