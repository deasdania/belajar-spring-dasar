package programmerzamannow.spring.core;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtils {

    private static final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    // // Method to hash a plain-text password
    // public static String hashPassword(String plaintextPassword) {
    //     return passwordEncoder.encode(plaintextPassword);
    // }

    // // Method to check if the plain-text password matches the hashed password
    // public static boolean checkpw(String plaintextPassword, String hashedPassword) {
    //     return passwordEncoder.matches(plaintextPassword, hashedPassword);
    // }

    // Method to hash a plain-text password
    public static String hashPassword(String plaintextPassword) {
        return BCrypt.hashpw(plaintextPassword);
    }

    // Method to check if the plain-text password matches the hashed password
    public static boolean checkpw(String plaintextPassword, String hashedPassword) {
        System.err.println("password:"+ plaintextPassword);
        System.err.println("hashed:"+ hashedPassword);
        return BCrypt.checkpw(plaintextPassword, hashedPassword);
    }
}