/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.ui;

import clicker.applicationlogic.Calculator;
import clicker.applicationlogic.PersonalCalculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

/**
 *
 * @author kraczlam5898
 */
public class ClickListener implements ActionListener{
    
    private Calculator calculator;
    private JLabel label;

    public ClickListener(Calculator calculator, JLabel label) {
        this.calculator = calculator;
        this.label = label;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        this.calculator.increase();
        String s = Integer.toString(this.calculator.giveValue());
        this.label.setText(s);
      
    }
    
}
