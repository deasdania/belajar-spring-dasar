package programmerzamannow.spring.core;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    
    // This method simulates user registration where the password is hashed
    @PostMapping("/hello")
    public String hello() {
        return "Hello, Spring Boot!";
    }

    // This method simulates user registration where the password is hashed
    @PostMapping("/register")
    public String register(@RequestParam String username, @RequestParam String password) {
        // Hash the password before storing it (e.g., in a database)
        String hashedPassword = PasswordUtils.hashPassword(password);
        
        // Simulate storing the username and hashed password
        // In a real app, you would save this to a database
        System.out.println("User Registered: " + username);
        System.out.println("Hashed Password: " + hashedPassword);
        
        return "User registered successfully!";
    }

    // This method simulates login where the plain-text password is checked against the stored hashed password
    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, @RequestParam String storedHashedPassword) {
        // Check if the plain-text password matches the stored hashed password
        if (PasswordUtils.checkpw(password, storedHashedPassword)) {
            return "Login successful!";
        } else {
            return "Invalid credentials!";
        }
    }
}

// $2a$10$nUcXIpXu2/lzn8a7IJI5pOEgvGABiIWFaRgr1xSrOK1OZmvbk8TSe