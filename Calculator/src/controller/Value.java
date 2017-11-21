package controller;

import view.PrintMessages;

public class Value {
    public  double[] FindingValues(String stroka) {
        int lenghth = 0, count = 0;
        String str="";
        double[] value = new double[2];
        lenghth = stroka.length();
        if(stroka.charAt(0)=='*'||stroka.charAt(0)=='/'||stroka.charAt(0)=='+'||stroka.charAt(0)=='='){
            PrintMessages printMessages=new PrintMessages();
            printMessages.Error();
        }else {
            if (stroka.charAt(0) != '-') {
                for (int i = 0; i < lenghth; i++) {
                    if (stroka.charAt(i) == '/' || stroka.charAt(i) == '*' || stroka.charAt(i) == '-' || stroka.charAt(i) == '+' || stroka.charAt(i) == '=') {
                        value[count] = Double.parseDouble(str);
                        count++;
                        str = "";
                        continue;
                    }
                    str = String.format("%s%s", str, stroka.charAt(i));
                }
            } else {
                for (int i = 1; i < lenghth; i++) {
                    if (stroka.charAt(i) == '/' || stroka.charAt(i) == '*' || stroka.charAt(i) == '-' || stroka.charAt(i) == '+' || stroka.charAt(i) == '=') {
                        value[count] = Double.parseDouble(str);
                        count++;
                        str = "";
                        continue;
                    }
                    str = String.format("%s%s", str, stroka.charAt(i));
                }
                value[0] = -value[0];
            }
        }
        return value;
    }
}

