import java.util.Scanner;
public class Main {

 public static void main(String[] args) {
        boolean error = false;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ведите первое число: ");
        String str1 = scan.next();
        int length = str1.length();
        char Char;
        double result;
        int count;
        if (length == 1) {
            Char = str1.charAt(0);
            if ((Char != '0') && (Char != '1') && (Char != '2') && (Char != '3') && (Char != '4') && (Char != '5') && (Char != '6') && (Char != '7') && (Char != '8') && (Char != '9')) {
                error = true;
                System.out.println("ERROR");
            }
        }
        if (length > 1) {
            Char = str1.charAt(0);
            if ((Char != '-')&&(Char != '0') && (Char != '1') && (Char != '2') && (Char != '3') && (Char != '4') && (Char != '5') && (Char != '6') && (Char != '7') && (Char != '8') && (Char != '9')) {
                error = true;
                System.out.println("ERROR");
            }
            if(Char=='-'){
                Char = str1.charAt(1);
                if ((Char != '1') && (Char != '2') && (Char != '3') && (Char != '4') && (Char != '5') && (Char != '6') && (Char != '7') && (Char != '8') && (Char != '9')) {
                    error = true;
                    System.out.println("ERROR");
                }
            }
        }
        if (error == false) {
            for (int i = 1; i < length; i++) {
                Char = str1.charAt(i);
                if ((Char != '.') && (Char != '0') && (Char != '1') && (Char != '2') && (Char != '3') && (Char != '4') && (Char != '5') && (Char != '6') && (Char != '7') && (Char != '8') && (Char != '9')) {
                    error = true;
                    System.out.println("ERROR");
                }
            }
            if (error == false) {
                System.out.print("Ведите второе число: ");
                String str2 = scan.next();
                length = str2.length();
                if (length == 1) {
                    Char = str2.charAt(0);
                    if ((Char != '0') && (Char != '1') && (Char != '2') && (Char != '3') && (Char != '4') && (Char != '5') && (Char != '6') && (Char != '7') && (Char != '8') && (Char != '9')) {
                        error = true;
                        System.out.println("ERROR");
                    }
                }
                if (length > 1) {
                    Char = str2.charAt(0);
                    if ((Char != '-')&&(Char != '0') && (Char != '1') && (Char != '2') && (Char != '3') && (Char != '4') && (Char != '5') && (Char != '6') && (Char != '7') && (Char != '8') && (Char != '9')) {
                        error = true;
                        System.out.println("ERROR");
                    }
                    if(Char=='-'){
                        Char = str2.charAt(1);
                        if ((Char != '1') && (Char != '2') && (Char != '3') && (Char != '4') && (Char != '5') && (Char != '6') && (Char != '7') && (Char != '8') && (Char != '9')) {
                            error = true;
                            System.out.println("ERROR");
                        }
                    }
                }
                if (error == false) {
                    for (int i = 1; i < length; i++) {
                        Char = str2.charAt(i);
                        if ((Char != '.') && (Char != '0') && (Char != '1') && (Char != '2') && (Char != '3') && (Char != '4') && (Char != '5') && (Char != '6') && (Char != '7') && (Char != '8') && (Char != '9')) {
                            error = true;
                            System.out.println("ERROR");
                        }
                    }
                    if (error == false) {
                        double number1 = Double.parseDouble(str1);
                        double number2 = Double.parseDouble(str2);
                        System.out.println("Выберите действия для чисел");
                        System.out.println("1) Сумма");
                        System.out.println("2) Минус");
                        System.out.println("3) Деление");
                        System.out.println("4) Умножение");
                        System.out.print("Ваш выбор: ");
                        String str3 = scan.next();
                        count = Integer.parseInt(str3);
                        if (count != 1 && count != 2 && count != 3 && count != 4) {
                            error = true;
                            System.out.println("ERROR");
                        }
                        if (error == false) {
                            switch (count) {
                                case 1:
                                    result = number1 + number2;
                                    System.out.println(result);
                                    break;
                                case 2:
                                    result = number1 - number2;
                                    System.out.println(result);
                                    break;
                                case 3:
                                    result = number1 / number2;
                                    System.out.println(result);
                                    break;
                                case 4:
                                    result = number1 * number2;
                                    System.out.println(result);
                                    break;
                            }
                        }
                    }

                }
            }
        }
    }
}