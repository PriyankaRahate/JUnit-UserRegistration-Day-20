package userRegistrationjunit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public boolean validateFirstName(String TestFirstName) {
        String firstNamePattern = "^[A-Z]{1}[a-z]{3,}$";
        return validatePattern(firstNamePattern,TestFirstName);
    }
    public boolean validateLastName(String TestLastName) {
        String lastNamePattern = "^[A-Z]{1}[a-z]{3,}$";
        return validatePattern(lastNamePattern,TestLastName);
    }

    public boolean validateEmail(String TestEmailId) {
        String emailPattern = "^[a-z]{3,}([._+-][a-z0-9]{3,})*@[a-z0-9]{2,}.[a-z]{2,3}([.+_-][a-z]{2,3})*$";
        return validatePattern(emailPattern,TestEmailId);
    }
    public boolean validateMobNumber(String TestNumber){
        String mobPattern= "^[0-9]{2}\s?[0-9]{10}$";
        return validatePattern(mobPattern,TestNumber);
    }
    public boolean validatePassword(String TestPassword){
        String passwordPattern= "(?=.{8,})(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]*[@#$%_!^&*][0-9a-zA-Z]*";
        return validatePattern(passwordPattern,TestPassword);
    }

    public boolean validatePattern(String inbuiltPattern, String TestPattern) {
        Pattern pattern = Pattern.compile(inbuiltPattern);
        Matcher matcher = pattern.matcher(TestPattern);
        if (matcher.matches())
            return true;
        else
            return false;
    }

    public String analyzeMood(String msg) {
        if (msg.toLowerCase().contains("sad"))
            return "sad";
        return null;
    }
    public String analyzeMood1(String msg) {
        if (msg.toLowerCase().contains("happy"))
            return "happy";
        return null;
    }
}