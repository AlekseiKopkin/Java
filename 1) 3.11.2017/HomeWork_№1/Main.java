public class Main {

    public static void main(String[] args) {
        boolean error = false;
        int length = args[0].length();
        char Char;
        double result;
        if (length == 1) {
            Char = args[0].charAt(0);
            if ((Char <48 ) || (Char >57)) {
                error = true;
                System.out.println("ERROR");
            }
        }
        if (length > 1) {
            Char = args[0].charAt(0);
            if ((Char != '-')&&(Char <48 ) || (Char >57)) {
                error = true;
                System.out.println("ERROR");
            }
            if(Char=='-'){
                Char = args[0].charAt(1);
                if ((Char <49 ) || (Char >57)) {
                    error = true;
                    System.out.println("ERROR");
                }
            }
        }
        if (error == false) {
            for (int i = 0; i < length; i++) {
                Char = args[0].charAt(i);
                if ((Char != '.') && (Char <48 ) || (Char >57)) {
                    error = true;
                    System.out.println("ERROR");
                }
            }
            if (error == false) {
                if (length == 1) {
                    Char = args[1].charAt(0);
                    if ((Char <48 ) || (Char >57)) {
                        error = true;
                        System.out.println("ERROR");
                    }
                }
                if (length > 1) {
                    Char = args[1].charAt(0);
                    if ((Char != '-')&&(Char <48 ) || (Char >57)) {
                        error = true;
                        System.out.println("ERROR");
                    }
                    if(Char=='-'){
                        Char = args[1].charAt(1);
                        if ((Char <49 ) || (Char >57)) {
                            error = true;
                            System.out.println("ERROR");
                        }
                    }
                }
                if (error == false) {
                    for (int i = 0; i < length; i++) {
                        Char = args[1].charAt(i);
                        if ((Char != '.') && (Char <48 ) || (Char >57)) {
                            error = true;
                            System.out.println("ERROR");
                        }
                    }
                    if (error == false) {
                        double number1 = Double.parseDouble(args[0]);
                        double number2 = Double.parseDouble(args[1]);
                        result = number1 + number2;
                        System.out.println(result);
                    }
                }

            }
        }
    }
}