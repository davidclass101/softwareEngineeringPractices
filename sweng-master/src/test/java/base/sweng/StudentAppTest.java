package base.sweng;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StudentAppTest {

    @Test
    public void testValidApplication() {
        assertDoesNotThrow(() -> new StudentApp("1234567890", "John", "Doe", "1990-01-01", "I want to learn and contribute."));
    }

    @Test
    public void testTooLongStudentNumber() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new StudentApp("12345678901", "John", "Doe", "1990-01-01", "I want to learn and contribute.");
        });
        assertTrue(exception.getMessage().contains("Invalid student number"));
    }

    @Test
    public void testTooLongName() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new StudentApp("1234567890", "JohnathanChristopherDoeJohnathanChristopherDoeJohnathanChristopherDoe", "Doe", "1990-01-01", "I want to learn and contribute.");
        });
        assertTrue(exception.getMessage().contains("Invalid name"));
    }

    @Test
    public void testTooLongSurname() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new StudentApp("1234567890", "John", "DoeDoeDoeDoeDoeDoeDoeDoeDoeDoeDoeDoeDoeDoeDoeDoeDoeDoeDoeDoe", "1990-01-01", "I want to learn and contribute.");
        });
        assertTrue(exception.getMessage().contains("Invalid surname"));
    }

    @Test
    public void testTooLongMotivation() {
        String longMotivation = "a".repeat(501); // Create a string with 501 'a' characters
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new StudentApp("1234567890", "John", "Doe", "1990-01-01", longMotivation);
        });
        assertTrue(exception.getMessage().contains("Invalid motivation"));
    }
}