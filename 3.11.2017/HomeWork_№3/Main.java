import java.util.Scanner;
public class Main {

    public static void main(String args[]) {
        int number;
        int length;
        char Char;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to calculate the factorial: ");
        String str = scan.next();
        length = str.length();
        for (int i = 0; i < length; i++) {
            Char = str.charAt(i);
            if ((Char != '0') && (Char != '1') && (Char != '2') && (Char != '3') && (Char != '4') && (Char != '5') && (Char != '6') && (Char != '7') && (Char != '8') && (Char != '9')) {
                System.out.println("ERROR");
                return;
            }
        }
        do {
                number = Integer.parseInt(str);
                long result = 1;
                if (number == 0 || number == 1)
                    System.out.println(number + "!  = " + result);
                for (int i = 2; i <= number; i++) {
                    result = result * i;
                    if (i >= number) {
                        System.out.println(number + "!  = " + result);
                    }
                }
        } while (number < 0);
        System.out.println("End");
    }
}