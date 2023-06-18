package com.parthu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerRestController {

	@GetMapping("/{name}")
	public String getMsg(@PathVariable String name) {
		return "Hi, "+name+"  Good Evening";
	}
}
