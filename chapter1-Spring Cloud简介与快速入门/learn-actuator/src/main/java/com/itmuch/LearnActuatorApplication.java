package com.itmuch;

import com.itmuch.controller.HelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 写注解
@SpringBootApplication(scanBasePackageClasses = HelloController.class)
public class LearnActuatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnActuatorApplication.class, args);
	}
}
