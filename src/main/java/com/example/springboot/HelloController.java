package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/health")
	public String index() {
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
