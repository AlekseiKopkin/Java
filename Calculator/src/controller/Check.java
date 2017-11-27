package controller;

import view.PrintMessages;
public class Check {
    int count = 0;
    String passwordEncryption;
PrintMessages printMessages=new PrintMessages();

    public int NumberSing(int numberSing) {
        if (numberSing > 2) {
            printMessages.ErrorResult();
            return 1;
        }
        return 0;
    }

    public int NumberPoints(String stroka) {
        try {
            for (int i = 0; i < stroka.length() - 1; i++) {
                if (stroka.charAt(i) == '.'||stroka.charAt(i+1)=='.') {
                    printMessages.ErrorResult();
                    return 1;
                } else {
                    return 0;
                }
            }
        } catch (Exception e) {
            printMessages.ErrorResult();
            return 1;
        }
        return 0;
    }

    public int CheckValue(String[][] stroka) {
        passwordEncryption = PasswordEncryption.encryptMD5(stroka[1][0]);
        stroka[1][0] = passwordEncryption;
        if (!((stroka[0][0]).equals(stroka[0][1])) || !((stroka[1][0]).equals(stroka[1][1]))) {
            printMessages.ErrorIndetificator();
            return 1;
        } else {
            return 0;
        }
    }
}

