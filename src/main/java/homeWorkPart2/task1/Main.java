package homeWorkPart2.task1;

public class Main {

    public static void main(String[] args) {

        UserValidator.Email eleriEmail = new UserValidator.Email("elEri@something.com");
        System.out.println("Unformatted email: " + eleriEmail.getEmail());

        String alternativeEmail = "john@exaMple.cOm";

        eleriEmail.validateEmails(eleriEmail.formatEmail(), alternativeEmail);

        String alternativeEmail2 = "";
        eleriEmail.validateEmails(eleriEmail.formatEmail(), alternativeEmail2);
    }


}
