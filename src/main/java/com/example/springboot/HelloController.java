// Cmd to run this file: ./mvnw spring-boot:run

package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Welcome to your shopping cart!";
	}
	@GetMapping("/health")
	public String health() {
		return "Health Check Successful!";
	}

	@GetMapping("/update")
	public String update() {
		return "Functions here to update cart";
	}

	@GetMapping("/check_cart")
	public String check_cart() {
		return "Functions here to check cart contents";
	}

	@GetMapping("/empty_out")
	public String empty_out() {
		return "Functions here to empty cart (checkout)";
	}

}
