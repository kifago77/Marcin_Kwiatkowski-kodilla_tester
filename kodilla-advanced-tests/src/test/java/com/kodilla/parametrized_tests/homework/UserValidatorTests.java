package com.kodilla.parametrized_tests.homework;

import com.kodilla.parametrized_tests.UserValidator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserValidatorTests {
    private  UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"Test123","123123312","Test1-211212"})
    void testValidateUsernameCorrect(String s){
        assertEquals(true,userValidator.validateUsername(s));
    }

    @ParameterizedTest
    @ValueSource(strings = {"12","a",""})
    void testValidateUsernameIncorrect(String s){
        assertEquals(false,userValidator.validateUsername(s));
    }

    @ParameterizedTest
    @ValueSource(strings = {"test123@gmail.com","test1233123213@gmail.com"})
    void testValidateEmailCorrect(String s){
        assertEquals(true,userValidator.validateEmail(s));
    }

    @ParameterizedTest
    @ValueSource(strings = {"test123gmail.com","test1233123213gmail.com"})
    void testValidateEmailIncorrect(String s){
        assertEquals(false,userValidator.validateEmail(s));
    }
}
