package view;


import controller.ButtonIndetificator;
import controller.IndeteficatorPanel;

import javax.swing.*;

public class IndentificatorFrame extends JFrame {

    public IndentificatorFrame() {
        this.setBounds(100, 100, 345, 170);
        this.setTitle("Indentificator");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setLayout(null);
        new IndeteficatorPanel(this);
        this.setVisible(true);
        new ButtonIndetificator();
    }
}