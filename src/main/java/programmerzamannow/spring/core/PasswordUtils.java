package programmerzamannow.spring.core;

public class PasswordUtils {

    // Method to hash a plain-text password
    public static String hashPassword(String plaintextPassword) {
        return BCrypt.hashpw(plaintextPassword);
    }

    // Method to check if the plain-text password matches the hashed password
    public static boolean checkpw(String plaintextPassword, String hashedPassword) {
        return BCrypt.checkpw(plaintextPassword, hashedPassword);
    }
}