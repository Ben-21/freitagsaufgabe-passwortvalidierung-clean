package de.neuefische.freitagsaufgabepasswortvalidierungclean;


public class Checkings {


    public int checkPasswordLength(Password password) {
        return password.getWord().length();
    }


    public boolean checkIfNumbersAreIncluded(Password password) {
        return password.getWord().matches(".*\\d.*");
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

    public boolean checkIfLowerCaseLettersAreIncluded(Password password) {

        String word = password.getWord();
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLowerCase(word.charAt(i))) {
                return true;
            }
        }
        return false;

    }

    public boolean checkIfPasswordIsGood(Password password) {

        if (password == null || password.getWord() == null || password.getWord().isEmpty()) {
            return false;
        }

        return switch (password.getWord()) {
            case "1234567890", "football", "abcdefg", "qwerty123", "letmein", "admin", "iloveyou", "welcome", "password123", "123abc", "sunshine" ->
                    false;
            default -> true;
        };


    }
}
