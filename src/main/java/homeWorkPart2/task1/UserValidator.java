package homeWorkPart2.task1;

import java.util.regex.Pattern;

public class UserValidator {

    public static class Email {

        private String email;

        public Email(String email) {
            this.email = email;
        }

        protected String formatEmail() {
            return email.toLowerCase();
        }

        public boolean isValidEmail() {
            String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
            return Pattern.matches(regex, email);
        }

        public void validateEmails(String email, String alternativeEmail) {

            Email emailFormatted = new Email(email == null ? "unknown" : email);
            Email alternativeEmailFormatted = new Email(alternativeEmail == null ? "unknown" : alternativeEmail);

            if (!emailFormatted.isValidEmail()) {
                emailFormatted = new Email("unknown");
            }
            if (!alternativeEmailFormatted.isValidEmail()) {
                alternativeEmailFormatted = new Email("unknown");
            }

            System.out.println("Email: " + emailFormatted.formatEmail());
            System.out.println("Alternative Email: " + alternativeEmailFormatted.formatEmail());
        }

        public String getEmail() {
            return email;
        }
    }
}
