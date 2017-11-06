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
            if ((Char <48 ) || (Char >57)) {
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