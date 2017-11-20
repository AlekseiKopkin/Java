package controller;

import controller.Calculator;
import controller.Check;
import controller.Value;
import view.CalculatorFrame;
import view.PrintMessages;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CalculatorPanel extends JPanel{
    static JTextField textField = null;
    int lenght = 0;
    String strokaResult = "", sing = "", deteleSrokaResult = "";
    int numberSing = 0;
    double result = 0;
    double[] valueParameters = new double[2];
    Check check = new Check();
    Value value = new Value();
    Calculator calc = new Calculator();
    public  CalculatorPanel() {
        try
        {
            setLayout(null);
            // Specifies the position of the element

            final TextField textField = new TextField();
            textField.setBounds(10, 10, 235, 25);

            JButton buttonRemove =new JButton("C");
           buttonRemove.setBounds(270,10,50,60);

            JButton buttonClaen=new JButton("CE");
            buttonClaen.setBounds(270,80,50,60);

            JButton button0 = new JButton("0");
            button0.setBounds(10, 270, 50, 50);

            JButton button1 = new JButton("1");
            button1.setBounds(10, 190, 50, 50);

            JButton button2 = new JButton("2");
            button2.setBounds(60, 190, 50, 50);

            JButton button3 = new JButton("3");
            button3.setBounds(110, 190, 50, 50);

            JButton button4 = new JButton("4");
            button4.setBounds(10, 110, 50, 50);

            JButton button5 = new JButton("5");
            button5.setBounds(60, 110, 50, 50);

            JButton button6 = new JButton("6");
            button6.setBounds(110, 110, 50, 50);

            JButton button7 = new JButton("7");
            button7.setBounds(10, 40, 50, 50);

            JButton button8 = new JButton("8");
            button8.setBounds(60, 40, 50, 50);

            JButton button9 = new JButton("9");
            button9.setBounds(110, 40, 50, 50);

            JButton buttonResult = new JButton("=");
            buttonResult.setBounds(110, 270, 50, 50);
            Font bigFont = new Font("serif", Font.BOLD, 22);
            buttonResult.setFont(bigFont);

            JButton buttonPlus = new JButton("+");
            buttonPlus.setBounds(170, 40, 75, 50);
            Font bigFontPlus = new Font("serif", Font.BOLD, 22);
            buttonPlus.setFont(bigFontPlus);

            JButton buttonMinus = new JButton("-");
            buttonMinus.setBounds(170, 110, 75, 50);
            Font bigFontMinus = new Font("serif", Font.BOLD, 22);
            buttonMinus.setFont(bigFontMinus);

            JButton buttonMultiplication = new JButton("*");
            buttonMultiplication.setBounds(170, 190, 75, 50);
            Font bigFontMulti = new Font("serif", Font.BOLD, 22);
            buttonMultiplication.setFont(bigFontMulti);

            JButton buttonDivision = new JButton("/");
            buttonDivision.setBounds(170, 270, 75, 50);
            Font bigFontDivision = new Font("serif", Font.BOLD, 22);
            buttonDivision.setFont(bigFontDivision);

            JButton buttonPoint = new JButton(".");
            buttonPoint.setBounds(60, 270, 50, 50);
            Font bigFontPoint = new Font("serif", Font.BOLD, 22);
            buttonPoint.setFont(bigFontPoint);

            add(buttonClaen);
            add(buttonRemove);
            add(textField);
            add(button0);
            add(button1);
            add(button2);
            add(button3);
            add(button4);
            add(button5);
            add(button6);
            add(button7);
            add(button8);
            add(button9);
            add(buttonResult);
            add(buttonPlus);
            add(buttonMinus);
            add(buttonMultiplication);
            add(buttonDivision);
            add(buttonPoint);

            buttonClaen.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    textField.setText("");
                }
            });
            buttonRemove.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    lenght= textField.getText().length();
                    if(lenght!=0) {
                        deteleSrokaResult = textField.getText().substring(0, lenght - 1);
                    }
                    textField.setText(deteleSrokaResult);
                }
            });
            button0.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    textField.setText(textField.getText()+e.getActionCommand());
                }
            });
            button1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    textField.setText(textField.getText()+e.getActionCommand());
                }
            });
            button2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    textField.setText(textField.getText()+e.getActionCommand());
                }
            });
            button3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    textField.setText(textField.getText()+e.getActionCommand());
                }
            });
            button4.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    textField.setText(textField.getText()+e.getActionCommand());
                }
            });
            button5.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    textField.setText(textField.getText()+e.getActionCommand());
                }
            });
            button6.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    textField.setText(textField.getText()+e.getActionCommand());
                }
            });
            button7.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    textField.setText(textField.getText()+e.getActionCommand());
                }
            });
            button8.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    textField.setText(textField.getText()+e.getActionCommand());
                }
            });
            button9.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    textField.setText(textField.getText()+e.getActionCommand());
                }
            });
            buttonDivision.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    numberSing++;
                    check.NumberSing(numberSing);
                    textField.setText(textField.getText()+e.getActionCommand());
                    sing = "/";

                }
            });
            buttonMinus.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    numberSing++;
                    check.NumberSing(numberSing);
                    textField.setText(textField.getText()+e.getActionCommand());
                    sing = "-";
                }
            });
            buttonMultiplication.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    numberSing++;
                    check.NumberSing(numberSing);
                    textField.setText(textField.getText()+e.getActionCommand());
                    sing = "*";
                }
            });
            buttonPlus.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    numberSing++;
                    check.NumberSing(numberSing);
                    textField.setText(textField.getText()+e.getActionCommand());
                    sing = "+";
                }
            });
            buttonPoint.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    textField.setText(textField.getText()+e.getActionCommand());
                    check.NumberPoints(textField.getText());
                }
            });
            buttonResult.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    numberSing=0;
                    textField.setText(textField.getText()+e.getActionCommand());
                    valueParameters=value.FindingValues(textField.getText());
                    result=calc.calc(valueParameters[0],sing,valueParameters[1]);
                    textField.setText(textField.getText()+Double.toString(result));
                }
            });
        }
        catch (ArithmeticException exception)
        {
           PrintMessages printMessages=new PrintMessages();
            printMessages.Error();
       }
    }
}

