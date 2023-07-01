package de.neuefische.freitagsaufgabepasswortvalidierungclean;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Methods {


    public int checkPasswordLength(Password password) {

        return password.getWord().length();

    }
}
