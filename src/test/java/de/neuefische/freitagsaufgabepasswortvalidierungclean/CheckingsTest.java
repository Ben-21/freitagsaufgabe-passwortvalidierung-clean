package de.neuefische.freitagsaufgabepasswortvalidierungclean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

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

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"admin", "qwerty123", "football", "abcdefg", "letmein", "iloveyou", "welcome", "password123", "123abc", "sunshine",})
    void returnFalse_whenTestIfPasswordIsGood(String str) {
        //GIVEN
        Password password = new Password(str);
        Checkings checkings = new Checkings();
        boolean expected = false;


        //WHEN
        boolean actual = checkings.checkIfPasswordIsGood(password);


        //THEN
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(strings = {"asdkleu", "022dfssdf", "!dfgerg§$%fgfgh56"})
    void returnTrue_whenTestIfPasswordIsGood(String str) {
        //GIVEN
        Password password = new Password(str);
        Checkings checkings = new Checkings();
        boolean expected = true;


        //WHEN
        boolean actual = checkings.checkIfPasswordIsGood(password);


        //THEN
        Assertions.assertEquals(expected, actual);
    }

}


