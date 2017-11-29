package view;

import controller.ButtonCalculator;
import controller.CalculatorPanel;
import javax.swing.*;

public class CalculatorFrame extends JFrame
{
   public CalculatorFrame() {
       this.setBounds(100, 100, 360, 380);
       this.setTitle("Calculator");
       this.setDefaultCloseOperation(EXIT_ON_CLOSE);
       this.setLocationRelativeTo(null);
       this.setResizable(false);
       this.getContentPane().setLayout(null);
       new CalculatorPanel(this);
       this.setVisible(true);
       new ButtonCalculator();
   }
}
