package utils;

import com.github.javafaker.Faker;

import java.awt.*;
import java.util.Random;

public class DataGenerator {

        public static String generateLogin() {
            Faker faker = new Faker();
            String generatedLogin = faker.superhero().prefix()+faker.name().firstName()+faker.address().buildingNumber();
            return generatedLogin;
        }
        public static String generatePassword() {
            Faker faker = new Faker();
            String generatedPassword = faker.superhero().prefix()+faker.name().firstName()+faker.address().buildingNumber();
            return generatedPassword;
        }

    }

    