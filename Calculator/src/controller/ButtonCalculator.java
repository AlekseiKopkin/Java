package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonCalculator {
    String sing = "", deteleSrokaResult = "";
    int numberSing = 0;
    Check check = new Check();
    Value value = new Value();
    Calculator calc = new Calculator();

    public ButtonCalculator() {
        CalculatorPanel.getButton0().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CalculatorPanel.textField.setText(CalculatorPanel.textField.getText() + e.getActionCommand());
            }
        });
        CalculatorPanel.getButton1().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CalculatorPanel.textField.setText(CalculatorPanel.textField.getText() + e.getActionCommand());
            }
        });
        CalculatorPanel.getButton2().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CalculatorPanel.textField.setText(CalculatorPanel.textField.getText() + e.getActionCommand());
            }
        });
        CalculatorPanel.getButton3().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CalculatorPanel.textField.setText(CalculatorPanel.textField.getText() + e.getActionCommand());
            }
        });
        CalculatorPanel.getButton4().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CalculatorPanel.textField.setText(CalculatorPanel.textField.getText() + e.getActionCommand());
            }
        });
        CalculatorPanel.getButton5().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CalculatorPanel.textField.setText(CalculatorPanel.textField.getText() + e.getActionCommand());
            }
        });
        CalculatorPanel.getButton6().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CalculatorPanel.textField.setText(CalculatorPanel.textField.getText() + e.getActionCommand());
            }
        });
        CalculatorPanel.getButton7().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CalculatorPanel.textField.setText(CalculatorPanel.textField.getText() + e.getActionCommand());
            }
        });
        CalculatorPanel.getButton8().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CalculatorPanel.textField.setText(CalculatorPanel.textField.getText() + e.getActionCommand());
            }
        });
        CalculatorPanel.getButton9().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CalculatorPanel.textField.setText(CalculatorPanel.textField.getText() + e.getActionCommand());
            }
        });
        CalculatorPanel.getButtonDivision().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numberSing++;
                if (check.NumberSing(numberSing) == 1) {
                    numberSing = 0;
                } else {
                    CalculatorPanel.textField.setText(CalculatorPanel.textField.getText() + e.getActionCommand());
                    sing = "/";
                }
            }
        });
        CalculatorPanel.getButtonMinus().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numberSing++;
                if (check.NumberSing(numberSing) == 1) {
                    numberSing = 0;
                } else {
                    CalculatorPanel.textField.setText(CalculatorPanel.textField.getText() + e.getActionCommand());
                    sing = "-";
                }
            }
        });
        CalculatorPanel.getButtonMultiplication().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numberSing++;
                if (check.NumberSing(numberSing) == 1) {
                    numberSing = 0;
                } else {
                    CalculatorPanel.textField.setText(CalculatorPanel.textField.getText() + e.getActionCommand());
                    sing = "*";
                }
            }
        });
        CalculatorPanel.getButtonPlus().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numberSing++;
                if (check.NumberSing(numberSing) == 1) {
                    numberSing = 0;
                } else {
                    CalculatorPanel.textField.setText(CalculatorPanel.textField.getText() + e.getActionCommand());
                    sing = "+";
                }
            }
        });
        CalculatorPanel.getbuttonClean().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CalculatorPanel.textField.setText("");
            }
        });
        CalculatorPanel.getButtonPoint().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (check.NumberPoints(CalculatorPanel.textField.getText()) == 0) {
                    CalculatorPanel.textField.setText(CalculatorPanel.textField.getText() + e.getActionCommand());
                } else {
                    numberSing = 0;
                }
            }
        });
        CalculatorPanel.getButtonRemove().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (CalculatorPanel.textField.getText().length() != 0) {
                    deteleSrokaResult = CalculatorPanel.textField.getText().substring(0, CalculatorPanel.textField.getText().length() - 1);
                }
                CalculatorPanel.textField.setText(deteleSrokaResult);
            }
        });
        CalculatorPanel.getButtonResult().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numberSing = 0;
                CalculatorPanel.textField.setText(CalculatorPanel.textField.getText() + e.getActionCommand());
                if (value.FindingValues(CalculatorPanel.textField.getText())[1] != -1) {
                    CalculatorPanel.textField.setText(CalculatorPanel.textField.getText() + Double.toString(calc.calc(value.FindingValues(CalculatorPanel.textField.getText())[0], sing, value.FindingValues(CalculatorPanel.textField.getText())[1])));
                }
            }
        });
    }
}
