package demo;

public class EmailService {

    void sendEmail(Person person, String message) {
        System.out.println("Sending email to " + person.getName() + "with content: " + message);
    }
}
