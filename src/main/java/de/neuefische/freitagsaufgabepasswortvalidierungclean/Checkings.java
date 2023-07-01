package de.neuefische.freitagsaufgabepasswortvalidierungclean;


public class Checkings {


    public int checkPasswordLength(Password password) {
        return password.getWord().length();
    }


    public boolean checkIfNumbersAreIncluded(Password password) {
        return password.getWord().matches(".*\\d.*");
    }
}
