package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PersonTests {
    private Person person1;
    private Person person2;
    private Person person3;

    @BeforeEach
    void setUpPerson(){
        person1 = new Person(1.80,80.5);
        person2 = new Person(1.65,97.6);
        person3 = new Person(1.93,58.6);
    }

    @Test
    void testCalculatingBMI(){
        assertEquals("Normal (healthy weight)",person1.getBMI());
        assertEquals("Obese Class II (Severely obese)",person2.getBMI());
        assertEquals("Severely underweight",person3.getBMI());

        assertNotEquals("Overweight",person1.getBMI());
        assertNotEquals("Obese Class III (Very severely obese)",person2.getBMI());
        assertNotEquals("Very severely underweight",person3.getBMI());
    }
}
