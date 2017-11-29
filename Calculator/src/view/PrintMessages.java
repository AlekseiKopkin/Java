package view;
import controller.CalculatorPanel;
import controller.IndeteficatorPanel;

import javax.swing.*;

public class PrintMessages {
    public void ErrorIndetificator (){
        JOptionPane.showMessageDialog(null, "ERROR");
        IndeteficatorPanel.getTextPassword().setText("");
        IndeteficatorPanel.getTextLodin().setText("");
    }
    public void ErrorResult (){
        JOptionPane.showMessageDialog(null, "ERROR");
        CalculatorPanel.textField.setText("");
    }
}
