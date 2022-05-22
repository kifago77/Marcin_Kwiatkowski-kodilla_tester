package com.kodilla.parametrized_tests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserValidatorTests {
    private UserValidator userValidator = new UserValidator();

    @Test
    void testValidateUsername(){
        assertEquals(true,userValidator.validateUsername("Test123"));
        assertEquals(false,userValidator.validateUsername("12"));
        assertEquals(true,userValidator.validateUsername("Test12321--1212"));
    }

    @Test
    void testValidateEmail(){
        assertEquals(true,userValidator.validateEmail("test123@gmail.com"));
        assertEquals(false,userValidator.validateEmail("test123gmail.com"));
    }
}
