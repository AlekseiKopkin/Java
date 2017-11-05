import java.util.Scanner;
public class Main {

    public static void main(String args[]) {
        int length;
        char Char;
        Scanner scan = new Scanner(System.in);
        System.out.print("Lead line: ");
        String str = scan.next();
        length = str.length();
        for (int i = 0; i < length; i++) {
            Char = str.charAt(i);
            if ((Char != 65) && (Char != 66) && (Char != 67) && (Char != 68) && (Char != 69) && (Char != 70) && (Char != 71)
                    && (Char != 72) && (Char != 73) && (Char != 74) && (Char != 75) && (Char != 76) && (Char != 77) && (Char != 78) && (Char != 79) && (Char != 80)
                    && (Char != 81) && (Char != 82) && (Char != 83) && (Char != 84) &&
                    (Char != 85) && (Char != 86) && (Char != 87) && (Char != 88) && (Char != 89) && (Char != 90) && (Char != 97) && (Char != 98) && (Char != 99)
                    && (Char != 100) && (Char != 101) && (Char != 102) && (Char != 103) && (Char != 104) && (Char != 105) && (Char != 106) && (Char != 107) && (Char != 108)
                    && (Char != 109) && (Char != 110) && (Char != 111) && (Char != 112) && (Char != 113) && (Char != 114) && (Char != 115) && (Char != 116) && (Char != 117)
                    && (Char != 118) && (Char != 119) && (Char != 120) && (Char != 121) && (Char != 122)) {
                System.out.println("ERROR");
                return;
            }
        }
        for(int i=(length-1);i>-1;i--){
            System.out.print(str.charAt(i));
        }
    }
}