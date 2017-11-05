import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите две строки: ");
        char Char;
         String[] str = new String[2];
         int[][] letters = {{'A'  ,'B'  ,'C'  ,'E'  ,'H'  ,'K'  ,'M'  ,'O'  ,'P'  ,'T'  ,'X'  ,'a'  ,'c'  ,'e' ,'o' ,'p' ,'x' },
                {'А','В','С','Е','Н','К','М','О','Р','Т','Х','а','c','е','о','р','х'}};
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
            (Char != 'Й') && (Char != 'й') && (Char != 'Ц') && (Char != 'ц') && (Char != 'У') && (Char != 'у') && (Char != 'К')
                    && (Char != 'к') && (Char != 'Е') && (Char != 'е') && (Char != 'Н')&&(Char != 'н')&& (Char != 'Г')&& (Char != 'г')&& (Char != 'Ш')&& (Char != 'ш')
                    && (Char != 'Щ')&& (Char != 'щ')&& (Char != 'З')&& (Char != 'з') &&
                    (Char != 'Х') && (Char != 'х') && (Char != 'Ъ') && (Char != 'ъ')&&(Char != 'Ф')&& (Char != 'ф')&& (Char != 'Ы')&& (Char != 'ы')&& (Char != 'В')
                    && (Char != 'в') && (Char != 'А') && (Char != 'а') && (Char != 'П')&&(Char != 'п')&& (Char != 'Р')&& (Char != 'р')&& (Char != 'О')&& (Char != 'о')
                    && (Char != 'Л') && (Char != 'л') && (Char != 'Д') && (Char != 'д')&&(Char != 'Ж')&& (Char != 'ж')&& (Char != 'Э')&& (Char != 'э')&& (Char != 'Я')
                    && (Char != 'я') && (Char != 'Ч') && (Char != 'ч') && (Char != 'С')&&(Char != 'с')  && (Char != 'М') && (Char != 'м') && (Char != 'И')
                    && (Char != 'и')&&(Char != 'Т')&& (Char != 'т')&& (Char != 'Ь')&& (Char != 'ь')&& (Char != 'Б')
                    && (Char != 'б') && (Char != 'Ю') && (Char != 'ю')) {
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
                    (Char != 'Й') && (Char != 'й') && (Char != 'Ц') && (Char != 'ц') && (Char != 'У') && (Char != 'у') && (Char != 'К')
                    && (Char != 'к') && (Char != 'Е') && (Char != 'е') && (Char != 'Н')&&(Char != 'н')&& (Char != 'Г')&& (Char != 'г')&& (Char != 'Ш')&& (Char != 'ш')
                    && (Char != 'Щ')&& (Char != 'щ')&& (Char != 'З')&& (Char != 'з') &&
                    (Char != 'Х') && (Char != 'х') && (Char != 'Ъ') && (Char != 'ъ')&&(Char != 'Ф')&& (Char != 'ф')&& (Char != 'Ы')&& (Char != 'ы')&& (Char != 'В')
                    && (Char != 'в') && (Char != 'А') && (Char != 'а') && (Char != 'П')&&(Char != 'п')&& (Char != 'Р')&& (Char != 'р')&& (Char != 'О')&& (Char != 'о')
                    && (Char != 'Л') && (Char != 'л') && (Char != 'Д') && (Char != 'д')&&(Char != 'Ж')&& (Char != 'ж')&& (Char != 'Э')&& (Char != 'э')&& (Char != 'Я')
                    && (Char != 'я') && (Char != 'Ч') && (Char != 'ч') && (Char != 'С')&&(Char != 'с')  && (Char != 'М') && (Char != 'м') && (Char != 'И')
                    && (Char != 'и')&&(Char != 'Т')&& (Char != 'т')&& (Char != 'Ь')&& (Char != 'ь')&& (Char != 'Б')
                    && (Char != 'б') && (Char != 'Ю') && (Char != 'ю')) {
                System.out.println("ERROR");
                return;
            }
        }
        if(str[0].length()!=str[1].length()){
            System.out.println("Строки не совпадают");
            return;
        }
        layer: for(int i = 0; i<str[0].length();i++){
            if (str[0].charAt(i)==str[1].charAt(i)) break;
            for(int j =0; j <17;j++) {
                for(int k =0; k<17;j++) {
                    if(str[0].charAt(i)==letters[j][k]){
                        if(j==0 && str[1].charAt(i)==letters[1][k]) break layer;
                        else if (i==1 && str[1].charAt(i)==letters[0][k]) break layer;
                        System.out.println("Строки не совпадают");
                        return;
                    }
                }
            }
        }
        System.out.println("Строки совпадают");
    }
}