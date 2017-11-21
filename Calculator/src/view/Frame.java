package view;

import view.CalculatorFrame;
import view.IndentificatorFrame;

import javax.swing.*;

public class Frame extends JFrame {
    public  static CalculatorFrame calculatorFrame;
    public static IndentificatorFrame indentificatorFrame;
    public static CalculatorFrame getCalculatorFrame(){
        if(calculatorFrame==null){
            calculatorFrame=new CalculatorFrame();
            indentificatorFrame.dispose();
        }
        return calculatorFrame;
    }
    public static IndentificatorFrame getIndentificatorFrame(){
        if(indentificatorFrame==null){
            indentificatorFrame=new IndentificatorFrame();
        }
        return indentificatorFrame;
    }
}