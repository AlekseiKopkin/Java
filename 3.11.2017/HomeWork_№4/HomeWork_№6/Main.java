import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("������� ��� ������: ");
        char Char;
         String[] str = new String[2];
         int[][] letters = {{'A'  ,'B'  ,'C'  ,'E'  ,'H'  ,'K'  ,'M'  ,'O'  ,'P'  ,'T'  ,'X'  ,'a'  ,'c'  ,'e' ,'o' ,'p' ,'x' },
                {'�','�','�','�','�','�','�','�','�','�','�','�','c','�','�','�','�'}};
        Scanner scanner = new Scanner(System.in);
        str[0] = scanner.nextLine();
        int  length = str[0].length();
        for (int i = 0; i < length; i++) {
            Char = str[0].charAt(i);
            if ((Char != 'Q') && (Char != 'q') && (Char != 'W') && (Char != 'w') && (Char != 'E') && (Char != 'e') && (Char != 'R')
                    && (Char != 'r') && (Char != 'T') && (Char != 't') && (Char != 'Y')&&(Char != 'y')&& (Char != 'U')&& (Char != 'u')&& (Char != 'I')&& (Char != 'i')
                    && (Char != 'O')&& (Char != 'o')&& (Char != 'P')&& (Char != 'p') &&
                    (Char != 'A') && (Char != 'a') && (Char != 'S') && (Char != 's')&&(Char != 'D')&& (Char != 'd')&& (Char != 'F')&& (Char != 'f')&& (Char != 'G')
                    && (Char != 'g') && (Char != 'H') && (Char != 'h') && (Char != 'J')&&(Char != 'j')&& (Char != 'K')&& (Char != 'k')&& (Char != 'L')&& (Char != 'l')
                    && (Char != 'Z') && (Char != 'z') && (Char != 'X') && (Char != 'x')&&(Char != 'C')&& (Char != 'c')&& (Char != 'V')&& (Char != 'v')&& (Char != 'B')
                    && (Char != 'b') && (Char != 'N') && (Char != 'n') && (Char != 'M')&&(Char != 'm')&&
            (Char != '�') && (Char != '�') && (Char != '�') && (Char != '�') && (Char != '�') && (Char != '�') && (Char != '�')
                    && (Char != '�') && (Char != '�') && (Char != '�') && (Char != '�')&&(Char != '�')&& (Char != '�')&& (Char != '�')&& (Char != '�')&& (Char != '�')
                    && (Char != '�')&& (Char != '�')&& (Char != '�')&& (Char != '�') &&
                    (Char != '�') && (Char != '�') && (Char != '�') && (Char != '�')&&(Char != '�')&& (Char != '�')&& (Char != '�')&& (Char != '�')&& (Char != '�')
                    && (Char != '�') && (Char != '�') && (Char != '�') && (Char != '�')&&(Char != '�')&& (Char != '�')&& (Char != '�')&& (Char != '�')&& (Char != '�')
                    && (Char != '�') && (Char != '�') && (Char != '�') && (Char != '�')&&(Char != '�')&& (Char != '�')&& (Char != '�')&& (Char != '�')&& (Char != '�')
                    && (Char != '�') && (Char != '�') && (Char != '�') && (Char != '�')&&(Char != '�')  && (Char != '�') && (Char != '�') && (Char != '�')
                    && (Char != '�')&&(Char != '�')&& (Char != '�')&& (Char != '�')&& (Char != '�')&& (Char != '�')
                    && (Char != '�') && (Char != '�') && (Char != '�')) {
                System.out.println("ERROR");
                return;
            }
        }
        str[1] = scanner.nextLine();
        length = str[1].length();
        for (int i = 0; i < length; i++) {
            Char = str[1].charAt(i);
            if ((Char != 'Q') && (Char != 'q') && (Char != 'W') && (Char != 'w') && (Char != 'E') && (Char != 'e') && (Char != 'R')
                    && (Char != 'r') && (Char != 'T') && (Char != 't') && (Char != 'Y')&&(Char != 'y')&& (Char != 'U')&& (Char != 'u')&& (Char != 'I')&& (Char != 'i')
                    && (Char != 'O')&& (Char != 'o')&& (Char != 'P')&& (Char != 'p') &&
                    (Char != 'A') && (Char != 'a') && (Char != 'S') && (Char != 's')&&(Char != 'D')&& (Char != 'd')&& (Char != 'F')&& (Char != 'f')&& (Char != 'G')
                    && (Char != 'g') && (Char != 'H') && (Char != 'h') && (Char != 'J')&&(Char != 'j')&& (Char != 'K')&& (Char != 'k')&& (Char != 'L')&& (Char != 'l')
                    && (Char != 'Z') && (Char != 'z') && (Char != 'X') && (Char != 'x')&&(Char != 'C')&& (Char != 'c')&& (Char != 'V')&& (Char != 'v')&& (Char != 'B')
                    && (Char != 'b') && (Char != 'N') && (Char != 'n') && (Char != 'M')&&(Char != 'm')&&
                    (Char != '�') && (Char != '�') && (Char != '�') && (Char != '�') && (Char != '�') && (Char != '�') && (Char != '�')
                    && (Char != '�') && (Char != '�') && (Char != '�') && (Char != '�')&&(Char != '�')&& (Char != '�')&& (Char != '�')&& (Char != '�')&& (Char != '�')
                    && (Char != '�')&& (Char != '�')&& (Char != '�')&& (Char != '�') &&
                    (Char != '�') && (Char != '�') && (Char != '�') && (Char != '�')&&(Char != '�')&& (Char != '�')&& (Char != '�')&& (Char != '�')&& (Char != '�')
                    && (Char != '�') && (Char != '�') && (Char != '�') && (Char != '�')&&(Char != '�')&& (Char != '�')&& (Char != '�')&& (Char != '�')&& (Char != '�')
                    && (Char != '�') && (Char != '�') && (Char != '�') && (Char != '�')&&(Char != '�')&& (Char != '�')&& (Char != '�')&& (Char != '�')&& (Char != '�')
                    && (Char != '�') && (Char != '�') && (Char != '�') && (Char != '�')&&(Char != '�')  && (Char != '�') && (Char != '�') && (Char != '�')
                    && (Char != '�')&&(Char != '�')&& (Char != '�')&& (Char != '�')&& (Char != '�')&& (Char != '�')
                    && (Char != '�') && (Char != '�') && (Char != '�')) {
                System.out.println("ERROR");
                return;
            }
        }
        if(str[0].length()!=str[1].length()){
            System.out.println("������ �� ���������");
            return;
        }
        layer: for(int i = 0; i<str[0].length();i++){
            if (str[0].charAt(i)==str[1].charAt(i)) break;
            for(int j =0; j <17;j++) {
                for(int k =0; k<17;j++) {
                    if(str[0].charAt(i)==letters[j][k]){
                        if(j==0 && str[1].charAt(i)==letters[1][k]) break layer;
                        else if (i==1 && str[1].charAt(i)==letters[0][k]) break layer;
                        System.out.println("������ �� ���������");
                        return;
                    }
                }
            }
        }
        System.out.println("������ ���������");
    }
}