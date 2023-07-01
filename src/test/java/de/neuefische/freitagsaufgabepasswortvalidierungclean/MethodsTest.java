package de.neuefische.freitagsaufgabepasswortvalidierungclean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

 class MethodsTest {



    @Test
    void testPasswordLength(){
        //GIVEN
        Password password = new Password("thisismypassword");
        Methods methods = new Methods();
        int expected = 13;


        //WHEN
        int actualLength = methods.checkPasswordLength(password);

        //THEN
        Assertions.assertEquals(expected, actualLength);

    }

}
