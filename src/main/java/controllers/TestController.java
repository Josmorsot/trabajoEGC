package controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import domain.Greeting;

@RestController
@RequestMapping("/vote")
public class TestController {
	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong(); 
	@RequestMapping("/test")
	public Greeting greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template,
				name));
	}

}
