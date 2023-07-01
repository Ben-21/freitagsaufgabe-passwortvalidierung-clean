package de.neuefische.freitagsaufgabepasswortvalidierungclean;


public class Checkings {


    public int checkPasswordLength(Password password) {

        return password.getWord().length();

    }

    public boolean checkIfCapitalLettersAreIncluded(Password password) {

        String word = password.getWord();

        for (int i = 0; i < word.length(); i++) {

            if (Character.isUpperCase(word.charAt(i))) {

                return true;

            }

        }

        return false;

    }
}
