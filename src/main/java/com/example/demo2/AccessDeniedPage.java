package com.example.demo2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccessDeniedPage {
	@GetMapping("/accessDeniedPage")
	public String accessDeniedPage() {
		return "accessDeniedPage";
	}

}
