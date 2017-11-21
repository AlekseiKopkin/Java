package view;

import controller.CalculatorPanel;
import javax.swing.*;

public class CalculatorFrame extends JFrame
{
   public CalculatorFrame() {
       setBounds(100, 100, 360, 380);
       setTitle("Calculator");
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       add(new CalculatorPanel());
       setLocationRelativeTo(null);
       setResizable(false);
       setVisible(true);
   }
}
