package controller;

import view.Data;
import view.Frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonIndetificator {
    public ButtonIndetificator() {
        IndeteficatorPanel.getButtonEnter().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Data.getUserName() == 0) {
                    Frame.getCalculatorFrame();
                }
            }
        });
    }
}
