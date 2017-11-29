package view;

import controller.IndeteficatorPanel;
import model.File;

public class Data {
    public static int getUserName() {
        String[][] res = new String[3][3];
        char[] password;
        int error=0;
        res[0][0] = IndeteficatorPanel.getTextLodin().getText();
        password = IndeteficatorPanel.getTextPassword().getPassword();
        res[1][0] = new String(password);
        File file=new File();
        error=file.ReadFile(res);
        if(error==1){
            return 1;
        }else {
            return 0;
        }
    }
}
