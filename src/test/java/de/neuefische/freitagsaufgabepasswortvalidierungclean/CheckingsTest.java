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

}
