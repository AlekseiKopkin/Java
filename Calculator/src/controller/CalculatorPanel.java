package controller;

import view.CalculatorFrame;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class CalculatorPanel {
    public static JButton buttonRemove;
    public  static JButton buttonClean;
    public static JButton button0;
    public static JButton button1;
    public static JButton button2;
    public static JButton button3;
    public static JButton button4;
    public static JButton button5;
    public static JButton button6;
    public static JButton button7;
    public static JButton button8;
    public static JButton button9;
    public static JButton buttonResult;
    public static JButton buttonPlus;
    public static JButton buttonMinus;
    public static JButton buttonMultiplication;
    public static JButton buttonDivision;
    public static JButton buttonPoint;
    public static TextField textField;

   public CalculatorPanel (CalculatorFrame windowCal) {
        windowCal.add(getButton0());
        windowCal.add(getButton1());
        windowCal.add(getButton2());
        windowCal.add(getButton3());
        windowCal.add(getButton4());
        windowCal.add(getButton5());
        windowCal.add(getButton6());
        windowCal.add(getButton7());
        windowCal.add(getButton8());
        windowCal.add(getButton9());
        windowCal.add(getbuttonClean());
        windowCal.add(getButtonDivision());
        windowCal.add(getButtonMinus());
        windowCal.add(getButtonMultiplication());
        windowCal.add(getButtonPlus());
        windowCal.add(getButtonPoint());
        windowCal.add(getButtonRemove());
        windowCal.add(getButtonResult());
        windowCal.add(getTextField());

    }
    public static TextField getTextField() {
        if (textField == null) {
            textField = new TextField();
            textField.setBounds(10, 10, 235, 25);
        }
        return textField;
    }

    public static JButton getButtonRemove() {
        if ( buttonRemove == null) {
            buttonRemove =new JButton("C");
            buttonRemove.setBounds(270,10,50,60);
        }
        return buttonRemove;
    }

    public static JButton getbuttonClean() {
        if ( buttonClean == null) {
            buttonClean=new JButton("CE");
            buttonClean.setBounds(270,80,50,60);
        }
        return buttonClean;
    }

    public static JButton getButton0() {
        if ( button0 == null) {
            button0 = new JButton("0");
            button0.setBounds(10, 270, 50, 50);
        }
        return button0;
    }

    public static JButton getButton1() {
        if ( button1 == null) {
            button1 = new JButton("1");
            button1.setBounds(10, 190, 50, 50);
        }
        return button1;
    }
    public static JButton getButton2() {
        if ( button2 == null) {
            button2 = new JButton("2");
            button2.setBounds(60, 190, 50, 50);
        }
        return button2;
    }

    public static JButton getButton3() {
        if ( button3 == null) {
            button3 = new JButton("3");
            button3.setBounds(110, 190, 50, 50);
        }
        return button3;
    }
    public static JButton getButton4() {
        if ( button4 == null) {
            button4 = new JButton("4");
            button4.setBounds(10, 110, 50, 50);

        }
        return button4;
    }
    public static JButton getButton5() {
        if ( button5 == null) {
            button5 = new JButton("5");
            button5.setBounds(60, 110, 50, 50);
        }
        return button5;
    }
    public static JButton getButton6() {
        if ( button6 == null) {
            button6 = new JButton("6");
            button6.setBounds(110, 110, 50, 50);
        }
        return button6;
    }
    public static JButton getButton7() {
        if ( button7 == null) {
            button7 = new JButton("7");
            button7.setBounds(10, 40, 50, 50);
        }
        return button7;
    }
    public static JButton getButton8() {
        if ( button8 == null) {
            button8 = new JButton("8");
            button8.setBounds(60, 40, 50, 50);
        }
        return button8;
    }
    public static JButton getButton9() {
        if ( button9 == null) {
            button9 = new JButton("9");
            button9.setBounds(110, 40, 50, 50);
        }
        return button9;
    }
    public static JButton getButtonResult() {
        if ( buttonResult == null) {
            buttonResult = new JButton("=");
            buttonResult.setBounds(110, 270, 50, 50);
            Font bigFont = new Font("serif", Font.BOLD, 22);
            buttonResult.setFont(bigFont);
        }
        return buttonResult;
    }
    public static JButton getButtonPlus() {
        if ( buttonPlus == null) {
            buttonPlus = new JButton("+");
            buttonPlus.setBounds(170, 40, 75, 50);
            Font bigFontPlus = new Font("serif", Font.BOLD, 22);
            buttonPlus.setFont(bigFontPlus);
        }
        return buttonPlus;
    }

    public static JButton getButtonMinus() {
        if ( buttonMinus == null) {
             buttonMinus = new JButton("-");
            buttonMinus.setBounds(170, 110, 75, 50);
            Font bigFontMinus = new Font("serif", Font.BOLD, 22);
            buttonMinus.setFont(bigFontMinus);
        }
        return buttonMinus;
    }
    public static JButton getButtonMultiplication() {
        if ( buttonMultiplication == null) {
            buttonMultiplication = new JButton("*");
            buttonMultiplication.setBounds(170, 190, 75, 50);
            Font bigFontMulti = new Font("serif", Font.BOLD, 22);
            buttonMultiplication.setFont(bigFontMulti);
        }
        return buttonMultiplication;
    }


    public static JButton getButtonDivision() {
        if ( buttonPlus == null) {
            buttonDivision = new JButton("/");
            buttonDivision.setBounds(170, 270, 75, 50);
            Font bigFontDivision = new Font("serif", Font.BOLD, 22);
            buttonDivision.setFont(bigFontDivision);
        }
        return buttonDivision;
    }
    public static JButton getButtonPoint() {
        if ( buttonPoint == null) {
            buttonPoint = new JButton(".");
            buttonPoint.setBounds(60, 270, 50, 50);
            Font bigFontPoint = new Font("serif", Font.BOLD, 22);
            buttonPoint.setFont(bigFontPoint);
        }
        return buttonPoint;
    }
}
