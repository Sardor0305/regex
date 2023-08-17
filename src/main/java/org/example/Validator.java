package org.example;

import java.util.regex.Pattern;

public class Validator {
    public static final Pattern PHONE_NUMBER= Pattern.compile("^(\\+998)\\d{9}");
    public static final Pattern EMAIL_VALIDATOR = Pattern.compile("^[a-z](\\w+)(@)(\\w+)(\\.)(\\w+)$");

    public boolean checkPhoneNumber(String number){
        return PHONE_NUMBER.matcher(number).matches();


    }
    public boolean checkEmail(String email){
        return EMAIL_VALIDATOR.matcher(email).matches();
    }

}
