import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        boolean error = false;
        Scanner scan = new Scanner(System.in);
        System.out.print("Take the first number: ");
        String str1 = scan.next();
        int length = str1.length();
        char Char;
        double result;
        int count;
        if (length == 1) {
            Char = str1.charAt(0);
        if ((Char <48 ) || (Char >57)) {
                error = true;
                System.out.println("ERROR");
            }
        }
        if (length > 1) {
            Char = str1.charAt(0);
            if ((Char != '-')&&((Char <48 ) || (Char >57))) {
                error = true;
                System.out.println("ERROR");
            }
            if(Char=='-'){
                Char = str1.charAt(1);
                if ((Char <49 ) || (Char >57)) {
                    error = true;
                    System.out.println("ERROR");
                }
            }
        }
        if (error == false) {
            for (int i = 1; i < length; i++) {
                Char = str1.charAt(i);
                if ((Char != '.') && ((Char <48 ) || (Char >57))) {
                    error = true;
                    System.out.println("ERROR");
                }
            }
            if (error == false) {
                System.out.print("Take the second number: ");
                String str2 = scan.next();
                length = str2.length();
                if (length == 1) {
                    Char = str2.charAt(0);
                    if ((Char <48 ) || (Char >57)) {
                        error = true;
                        System.out.println("ERROR");
                    }
                }
                if (length > 1) {
                    Char = str2.charAt(0);
                    if ((Char != '-')&&((Char <48 ) || (Char >57))){
                        error = true;
                        System.out.println("ERROR");
                    }
                    if(Char=='-'){
                        Char = str2.charAt(1);
                        if ((Char <49 ) || (Char >57)) {
                            error = true;
                            System.out.println("ERROR");
                        }
                    }
                }
                if (error == false) {
                    for (int i = 1; i < length; i++) {
                        Char = str2.charAt(i);
                        if ((Char != '.') && ((Char <48 ) || (Char >57))) {
                            error = true;
                            System.out.println("ERROR");
                        }
                    }
                    if (error == false) {
                        double number1 = Double.parseDouble(str1);
                        double number2 = Double.parseDouble(str2);
                        System.out.println("Select the actions for numbers");
                        System.out.println("1) Amount");
                        System.out.println("2) Minus");
                        System.out.println("3) Division");
                        System.out.println("4) Multiplication");
                        System.out.print("Your choice: ");
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