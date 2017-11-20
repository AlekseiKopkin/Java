package model;

import controller.Check;
import view.PrintMessages;

import java.io.*;

public class File {
    PrintMessages printMessages = new PrintMessages();
    Check check=new Check();

    public void ReadFile(String[][] stroka) {
        String path = System.getProperty("user.dir") + "\\src\\model\\LoginPassword.txt";
        try (FileInputStream fin = new FileInputStream(path)) {
            int i = 0;
            BufferedReader reader = new BufferedReader(new FileReader(path));
            while ((stroka[i][1] = reader.readLine()) != null) {
                i++;
            }
            fin.close();
            check.CheckValue(stroka);
        } catch (IOException ex) {
            printMessages.Error();
        }
    }
}
