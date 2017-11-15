package com.company;

 class Check{
   private int length;
    void checkDouble(String count) {
        length = count.length();
        if (length == 1) {
            if (count.charAt(0) < 48 || count.charAt(0) > 57) {
                System.out.println("ERROR");
                System.exit(0);
            }
        }
        if (length != 1) {
            for (int i = 1; i < length; i++) {
                if ((count.charAt(i) != '.') && ((count.charAt(i) <48 ) || (count.charAt(i) >57))) {
                    System.out.println("ERROR");
                    System.exit(0);
                }
            }
        }
    }
    void checkInt(String count) {
        length = count.length();
        if (length == 1) {
            if (count.charAt(0) < 49 || count.charAt(0) > 57) {
                System.out.println("ERROR");
                System.exit(0);
            }
        }
        if (length != 1) {
            System.out.println("ERROR");
            System.exit(0);
        }
    }
    void checkCoordinate(String count){
        for (int i = 1; i < length; i++) {
            if ((count.charAt(i) != '.') && ((count.charAt(i) <48 ) || (count.charAt(i) >57))) {
                System.out.println("ERROR");
                System.exit(0);
            }
        }
    }
}
