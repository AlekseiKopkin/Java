package com.company;

import java.util.Scanner;

class Read {
    private  Scanner scanner = new Scanner(System.in);
    double ReadDouble(){
        Check check=new Check();
        String coun = scanner.next();
        check.checkDouble(coun);
        double count =Double.parseDouble(coun);
        return count;
    }
    int ReadInt(){
        Check check=new Check();
        String coun = scanner.next();
        check.checkInt(coun);
        int count=Integer.parseInt(coun);
        return count;
    }
    double ReadCoordinate(){
        Check check=new Check();
        String coun = scanner.next();
        check.checkCoordinate(coun);
        double count =Double.parseDouble(coun);
        return count;
    }
}
