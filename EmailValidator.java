import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

    // Regular expression for a basic email pattern
    private static final String EMAIL_REGEX =
        "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

    // 1. Create a method to validate an email address
    public static boolean isValidEmail(String email) {
        if (email == null) {
            return false;
        }
        // Compile the regex pattern
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        // Create a matcher object
        Matcher matcher = pattern.matcher(email);
        // Return true if the email matches the pattern
        return matcher.matches();
    }

    public static void main(String[] args) {
        // 4. Test strings
        String email1 = "test@example.com";     // Valid
        String email2 = "invalid-email.com";    // Invalid (missing @)
        String email3 = "user_name@domain.co.uk"; // Valid
        String email4 = "test@.com";            // Invalid (domain starts with a dot)
        String email5 = "test@domain";          // Invalid (no TLD)

        System.out.println(email1 + " is valid? " + isValidEmail(email1));
        System.out.println(email2 + " is valid? " + isValidEmail(email2));
        System.out.println(email3 + " is valid? " + isValidEmail(email3));
        System.out.println(email4 + " is valid? " + isValidEmail(email4));
        System.out.println(email5 + " is valid? " + isValidEmail(email5));
    }
}