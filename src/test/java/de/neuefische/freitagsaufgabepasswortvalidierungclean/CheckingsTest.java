package de.neuefische.freitagsaufgabepasswortvalidierungclean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CheckingsTest {


    @Test
    void testPasswordLength() {
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
    void testIfCapitalLettersAreIncluded() {
        //GIVEN
        Password password = new Password("thisisFypassword");
        Checkings checkings = new Checkings();
        boolean expected = true;

        //WHEN
        boolean actual = checkings.checkIfCapitalLettersAreIncluded(password);


        //THEN
        Assertions.assertEquals(expected, actual);

    }

}
