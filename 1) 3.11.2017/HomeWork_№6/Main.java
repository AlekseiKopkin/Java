import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter two strings: ");
        char Char;
        String str1;
        String str2;
        int[][] let = {{65, 66, 67, 69, 72, 75, 77, 79, 80, 84, 88, 97, 99, 101, 111, 112, 120},
                {1040, 1042, 1057, 1045, 1053, 1050, 1052, 1054, 1050, 1058, 1061, 1072, 1089, 1077, 1086, 1088, 1093}};
        int count=17;
        Scanner scanner = new Scanner(System.in);
        str1 = scanner.nextLine();
        int length = str1.length();
        for (int i = 0; i < length; i++) {
            Char = str1.charAt(i);
                if ((Char < 65 || Char > 122) && (Char <1040 || Char >1105)) {
                System.out.println("ERROR");
                return;
            }
        }
        str2 = scanner.nextLine();
        length = str2.length();
        for (int i = 0; i < length; i++) {
            Char = str2.charAt(i);
            if ((Char < 65 || Char > 122) && (Char <1040 || Char >1105)) {
                System.out.println("ERROR");
                return;
            }
        }
        if (str1.length() != str2.length()) {
            System.out.println("Not match lines");
            return;
        }
        layer:
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == str2.charAt(i)) break;
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k <count; j++) {
                    if (str1.charAt(i) == let[j][k]) {
                        if (j == 0 && str2.charAt(i) == let[1][k]) break layer;
                        else if (i == 1 && str2.charAt(i) == let[0][k]) break layer;
                        System.out.println("Not match lines");
                        return;
                    }
                }
            }
        }
        System.out.println("Match lines");
    }
}