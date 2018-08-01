package com.demo.hello;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping("/api")
	public Map getString() {
        return Collections.singletonMap("response", "Hello World");
    }
}