import java.util.Scanner;
public class Main {

    public static void main(String args[]) {
        int length;
        char Char;
        Scanner scan = new Scanner(System.in);
        System.out.print("¬ведите строку: ");
        String str = scan.next();
        length = str.length();
        for (int i = 0; i < length; i++) {
            Char = str.charAt(i);
            if ((Char != 'Q') && (Char != 'q') && (Char != 'W') && (Char != 'w') && (Char != 'E') && (Char != 'e') && (Char != 'R')
                    && (Char != 'r') && (Char != 'T') && (Char != 't') && (Char != 'Y')&&(Char != 'y')&& (Char != 'U')&& (Char != 'u')&& (Char != 'I')&& (Char != 'i')
                    && (Char != 'O')&& (Char != 'o')&& (Char != 'P')&& (Char != 'p') && 
                    (Char != 'A') && (Char != 'a') && (Char != 'S') && (Char != 's')&&(Char != 'D')&& (Char != 'd')&& (Char != 'F')&& (Char != 'f')&& (Char != 'G')
                    && (Char != 'g') && (Char != 'H') && (Char != 'h') && (Char != 'J')&&(Char != 'j')&& (Char != 'K')&& (Char != 'k')&& (Char != 'L')&& (Char != 'l')
                    && (Char != 'Z') && (Char != 'z') && (Char != 'X') && (Char != 'x')&&(Char != 'C')&& (Char != 'c')&& (Char != 'V')&& (Char != 'v')&& (Char != 'B')
                    && (Char != 'b') && (Char != 'N') && (Char != 'n') && (Char != 'M')&&(Char != 'm')) {
                System.out.println("ERROR");
                return;
            }
        }
       for(int i=(length-1);i>-1;i--){
           System.out.print(str.charAt(i));
       }
    }
}