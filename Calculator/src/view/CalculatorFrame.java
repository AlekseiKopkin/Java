package view;

import controller.ButtonCalculator;
import controller.CalculatorPanel;
import javax.swing.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

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
