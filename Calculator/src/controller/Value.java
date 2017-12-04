package controller;

import view.PrintMessages;

public class Value {
    PrintMessages printMessages = new PrintMessages();

    public double[] FindingValues(String stroka) {
        int lenghth = 0, count = 0;
        String str = "";
        double[] value = new double[2];
        value[0] = -1;
        value[1] = -1;
        lenghth = stroka.length();
        PrintMessages printMessages = new PrintMessages();
        try {
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
            return value;
        } catch (Exception e) {
            printMessages.ErrorResult();
            return value;
        }
    }

    public String Sing(String stroka) {
        String str = "";
        int lenghth = stroka.length();
        try {
            for (int i = 1; i < lenghth; i++) {
                if (stroka.charAt(i) == '/' || stroka.charAt(i) == '*' || stroka.charAt(i) == '-' || stroka.charAt(i) == '+' || stroka.charAt(i) == '=') {
                    str = String.valueOf(stroka.charAt(i));
                    break;
                }
            }
            return str;
        } catch (Exception e) {
            printMessages.ErrorResult();
            return str;
        }
    }

    public int Index(String stroka) {
        int index = 0,s=0;
        String str = "";
        int lenghth = stroka.length();
        try {
            for (int i = 0; i < lenghth; i++) {
                s++;
                if(stroka.charAt(i) == '='){
                    break;
                }

            }
            for (int i = s+1; i < lenghth; i++) {
                if (stroka.charAt(i) == '\\') {
                    index = Integer.parseInt(str);
                    break;
                }
                str = String.format("%s%s", str, stroka.charAt(i));
            }
            return index;
        } catch (Exception e) {
            printMessages.ErrorResult();
            return index;
        }
    }
    public String[][] Indetificator(String stroka){
        String res[][]=new String[2][2];
        String str = "";
        int count=0;
        int lenghth = stroka.length();
        try {
            for (int i = 0; i < lenghth; i++) {
                if (stroka.charAt(i) == '\\') {
                   res[count][0]=str;
                    str = "";
                    count++;
                    continue;
                }
                str = String.format("%s%s", str, stroka.charAt(i));
            }
            return res;
        } catch (Exception e) {
            printMessages.ErrorResult();
            return res;
        }
    }
}

