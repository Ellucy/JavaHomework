package homeWorkPart2.task1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class UserValidatorTest {

    @Test
    public void testValidEmail() {

        UserValidator.Email email = new UserValidator.Email("test@example.com");
        assertTrue(email.isValidEmail());
    }

    @Test
    public void testInvalidEmail() {

        UserValidator.Email email = new UserValidator.Email("invalid-email");
        assertFalse(email.isValidEmail());
    }

    @Test
    public void testEmptyEmail() {

        UserValidator.Email email = new UserValidator.Email("");
        assertFalse(email.isValidEmail());
    }

    @Test
    public void testFormatEmail() {

        UserValidator.Email email = new UserValidator.Email("ELERI@tesT.com");
        assertEquals("eleri@test.com", email.formatEmail());
    }

    @Test
    public void testValidateEmails() {
        UserValidator.Email email = new UserValidator.Email("eleri@test.com");
        UserValidator.Email alternativeEmail = new UserValidator.Email("eleri2@test.com");

        email.validateEmails("eleri@test.com", "eleri2@test.com");

        assertEquals("eleri@test.com", email.getEmail());
        assertEquals("eleri2@test.com", alternativeEmail.getEmail());
    }
}