package controller;

public class Value {
    public  double[] FindingValues(String stroka) {
        int lenghth = 0, count = 0;
        String str="";
        double[] value = new double[2];
        lenghth = stroka.length();

            for (int i = 0; i < lenghth; i++) {
                if (stroka.charAt(i) == '/' || stroka.charAt(i) == '*' || stroka.charAt(i) == '-' || stroka.charAt(i) == '+' || stroka.charAt(i) == '=') {
                    value[count] = Double.valueOf(str);
                    count++;
                    str = "";
                    continue;
                }
                str = String.format("%s%s", str, stroka.charAt(i));
            }
        return value;
    }
}

