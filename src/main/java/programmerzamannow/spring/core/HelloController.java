package programmerzamannow.spring.core;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // Mapping GET request to the root URL "/"
    @GetMapping("/")
    public String hello() {
        System.out.println("Hello spring boot");
        return "Hello, Spring Boot!";
    }

    // Mapping GET request to "/greet"
    @GetMapping("/greet")
    public String greet() {
        return "Greetings from Spring Boot!";
    }

    // Mapping GET request with a path variable
    @GetMapping("/greet/{name}")
    public String greetWithName(@PathVariable String name) {
        return "Hello, " + name + "!";
    }
}
