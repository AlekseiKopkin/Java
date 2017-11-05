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
            if ((Char != 65) && (Char != 66) && (Char != 67) && (Char != 68) && (Char != 69) && (Char != 70) && (Char != 71)
                    && (Char != 72) && (Char != 73) && (Char != 74) && (Char != 75) && (Char != 76) && (Char != 77) && (Char != 78) && (Char != 79) && (Char != 80)
                    && (Char != 81) && (Char != 82) && (Char != 83) && (Char != 84) &&
                    (Char != 85) && (Char != 86) && (Char != 87) && (Char != 88) && (Char != 89) && (Char != 90) && (Char != 97) && (Char != 98) && (Char != 99)
                    && (Char != 100) && (Char != 101) && (Char != 102) && (Char != 103) && (Char != 104) && (Char != 105) && (Char != 106) && (Char != 107) && (Char != 108)
                    && (Char != 109) && (Char != 110) && (Char != 111) && (Char != 112) && (Char != 113) && (Char != 114) && (Char != 115) && (Char != 116) && (Char != 117)
                    && (Char != 118) && (Char != 119) && (Char != 120) && (Char != 121) && (Char != 122) && (Char != 1040) && (Char != 1041) && (Char != 1042) && (Char != 1043) && (Char != 1044) && (Char != 1045) && (Char != 1046)
                    && (Char != 1047) && (Char != 1048) && (Char != 1049) && (Char != 1050) && (Char != 1051) && (Char != 1052) && (Char != 1053) && (Char != 1054) && (Char != 1055)
                    && (Char != 1056) && (Char != 1057) && (Char != 1058) && (Char != 1059) &&
                    (Char != 1060) && (Char != 1062) && (Char != 1063) && (Char != 1064) && (Char != 1065) && (Char != 1067) && (Char != 1068) && (Char != 1069) && (Char != 1070)
                    && (Char != 1071) && (Char != 1072) && (Char != 1073) && (Char != 1074) && (Char != 1075) && (Char != 1076) && (Char != 1077) && (Char != 1078) && (Char != 1079)
                    && (Char != 1080) && (Char != 1081) && (Char != 1082) && (Char != 1083) && (Char != 1084) && (Char != 1085) && (Char != 1086) && (Char != 1087) && (Char != 1088)
                    && (Char != 1089) && (Char != 1090) && (Char != 1091) && (Char != 1092) && (Char != 1093) && (Char != 1094) && (Char != 1095) && (Char != 1096)
                    && (Char != 1097) && (Char != 1098) && (Char != 1099) && (Char != 1100) && (Char != 1101) && (Char != 1102)
                    && (Char != 1103) && (Char != 1104) && (Char != 1105)) {
                System.out.println("ERROR");
                return;
            }
        }
        str2 = scanner.nextLine();
        length = str2.length();
        for (int i = 0; i < length; i++) {
            Char = str2.charAt(i);
            if ((Char != 65) && (Char != 66) && (Char != 67) && (Char != 68) && (Char != 69) && (Char != 70) && (Char != 71)
                    && (Char != 72) && (Char != 73) && (Char != 74) && (Char != 75) && (Char != 76) && (Char != 77) && (Char != 78) && (Char != 79) && (Char != 80)
                    && (Char != 81) && (Char != 82) && (Char != 83) && (Char != 84) &&
                    (Char != 85) && (Char != 86) && (Char != 87) && (Char != 88) && (Char != 89) && (Char != 90) && (Char != 97) && (Char != 98) && (Char != 99)
                    && (Char != 100) && (Char != 101) && (Char != 102) && (Char != 103) && (Char != 104) && (Char != 105) && (Char != 106) && (Char != 107) && (Char != 108)
                    && (Char != 109) && (Char != 110) && (Char != 111) && (Char != 112) && (Char != 113) && (Char != 114) && (Char != 115) && (Char != 116) && (Char != 117)
                    && (Char != 118) && (Char != 119) && (Char != 120) && (Char != 121) && (Char != 122) && (Char != 1040) && (Char != 1041) && (Char != 1042) && (Char != 1043) && (Char != 1044) && (Char != 1045) && (Char != 1046)
                    && (Char != 1047) && (Char != 1048) && (Char != 1049) && (Char != 1050) && (Char != 1051) && (Char != 1052) && (Char != 1053) && (Char != 1054) && (Char != 1055)
                    && (Char != 1056) && (Char != 1057) && (Char != 1058) && (Char != 1059) &&
                    (Char != 1060) && (Char != 1062) && (Char != 1063) && (Char != 1064) && (Char != 1065) && (Char != 1067) && (Char != 1068) && (Char != 1069) && (Char != 1070)
                    && (Char != 1071) && (Char != 1072) && (Char != 1073) && (Char != 1074) && (Char != 1075) && (Char != 1076) && (Char != 1077) && (Char != 1078) && (Char != 1079)
                    && (Char != 1080) && (Char != 1081) && (Char != 1082) && (Char != 1083) && (Char != 1084) && (Char != 1085) && (Char != 1086) && (Char != 1087) && (Char != 1088)
                    && (Char != 1089) && (Char != 1090) && (Char != 1091) && (Char != 1092) && (Char != 1093) && (Char != 1094) && (Char != 1095) && (Char != 1096)
                    && (Char != 1097) && (Char != 1098) && (Char != 1099) && (Char != 1100) && (Char != 1101) && (Char != 1102)
                    && (Char != 1103) && (Char != 1104) && (Char != 1105)) {
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
            for (int j = 0; j < count; j++) {
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