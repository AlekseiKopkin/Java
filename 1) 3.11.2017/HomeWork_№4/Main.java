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
            if ((Char < 65 || Char > 122)) {
                System.out.println("ERROR");
                return;
            }
        }
        for(int i=(length-1);i>-1;i--){
            System.out.print(str.charAt(i));
        }
    }
}