package controller;
import view.PrintMessages;

public class Check {
    int count = 0;
    String passwordEncryption;
    PrintMessages printMessages = new PrintMessages();

    public void NumberSing(int numberSing) {
        if (numberSing > 1) {
            printMessages.Error();
        }
    }

    public void NumberPoints(String stroka) {
        if (stroka.charAt(0) == '.') {
            printMessages.Error();
        }
        for (int i = 0; i < stroka.length(); i++) {
            if (count >2) {
                printMessages.Error();
            }
            if (stroka.charAt(i) == '/' || stroka.charAt(i) == '*' || stroka.charAt(i) == '-' || stroka.charAt(i) == '+') {
                if (stroka.charAt(i - 1) == '.') {
                    printMessages.Error();
                } else {
                    count = 0;
                }
            }else {
                if (stroka.charAt(i) == '.') {
                    count++;
               }
            }
        }
    }

    public void CheckValue(String[][] stroka) {
        passwordEncryption = PasswordEncryption.encryptMD5(stroka[1][0]);
        stroka[1][0] = passwordEncryption;
        if (!((stroka[0][0]).equals(stroka[0][1])) || !((stroka[1][0]).equals(stroka[1][1]))) {
            printMessages.Error();
        }
    }
}

