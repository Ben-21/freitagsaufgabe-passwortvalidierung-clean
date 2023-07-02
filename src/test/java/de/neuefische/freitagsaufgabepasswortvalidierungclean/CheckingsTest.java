package de.neuefische.freitagsaufgabepasswortvalidierungclean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CheckingsTest {


    @Test
    void returnLength_whenTestPasswordLength() {
        //GIVEN
        Password password = new Password("thisismypassword");
        Checkings checkings = new Checkings();
        int expected = 16;


        //WHEN
        int actualLength = checkings.checkPasswordLength(password);


        //THEN
        Assertions.assertEquals(expected, actualLength);
    }

    @Test
    void returnTrue_whenTestIfNumbersAreIncluded() {
        //GIVEN
        Password password = new Password("thisis1mypassword");
        Checkings checkings = new Checkings();
        boolean expected = true;


        //WHEN
        boolean actual = checkings.checkIfNumbersAreIncluded(password);


        //THEN
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void returnTrue_whenTestIfCapitalLettersAreIncluded() {
        //GIVEN
        Password password = new Password("thisisFypassword");
        Checkings checkings = new Checkings();
        boolean expected = true;


        //WHEN
        boolean actual = checkings.checkIfCapitalLettersAreIncluded(password);


        //THEN
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void returnFalse_whenTestIfCapitalLettersAreIncluded() {
        //GIVEN
        Password password = new Password("thisisypassword");
        Checkings checkings = new Checkings();
        boolean expected = false;


        //WHEN
        boolean actual = checkings.checkIfCapitalLettersAreIncluded(password);


        //THEN
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void returnTrue_whenTestIfLowerCaseLettersAreIncluded() {
        //GIVEN
        Password password = new Password("thisisFypassword");
        Checkings checkings = new Checkings();
        boolean expected = true;


        //WHEN
        boolean actual = checkings.checkIfLowerCaseLettersAreIncluded(password);


        //THEN
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void returnFalse_whenTestIfLowerCaseLettersAreIncluded() {
        //GIVEN
        Password password = new Password("ADSFGSDHGE");
        Checkings checkings = new Checkings();
        boolean expected = false;


        //WHEN
        boolean actual = checkings.checkIfLowerCaseLettersAreIncluded(password);


        //THEN
        Assertions.assertEquals(expected, actual);
    }
}


