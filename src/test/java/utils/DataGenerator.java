package utils;

import com.github.javafaker.Faker;

import java.util.concurrent.ThreadLocalRandom;

public class DataGenerator {
    private static final StringBuffer stringBuffer = new StringBuffer();

    public static String generateLogin() {
        Faker faker = new Faker();
        return faker.superhero().prefix() + faker.name().firstName() + faker.address().buildingNumber();
    }

    public static String generatePassword(int passwordLength) {
        String smallLetter = "abcdefghij";
        String upperLetter = "ABCDEFGHIJ";
        String digit = "0123456789";
        String chars = "!@#%^&!@#$";
        String password = smallLetter + upperLetter + digit + chars;

        for (int i = 0; i < passwordLength; i++) {
            stringBuffer.append(password.charAt(ThreadLocalRandom.current().nextInt(password.length())));
        }
        return stringBuffer.toString();
    }
}
