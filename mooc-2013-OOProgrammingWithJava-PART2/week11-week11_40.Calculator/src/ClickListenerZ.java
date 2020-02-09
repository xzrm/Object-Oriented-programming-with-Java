
import calc.applicationlogic.Calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kraczlam5898
 */
public class ClickListenerZ implements ActionListener {

    private Calculator calculator;
    private JTextField input;
    private JTextField output;
    private JButton button;

    public ClickListenerZ(Calculator calculator, JTextField input, JTextField output, JButton button) {
        this.calculator = calculator;
        this.input = input;
        this.output = output;
        this.button = button;
        this.button.setEnabled(false);

    }

    public void actionPerformed(ActionEvent e) {
        if (calculator.getTotal() == 0) {
            output.setEnabled(false);
            return;
        }
        this.calculator.setZero();
        String total = Integer.toString(this.calculator.getTotal());
        this.output.setText(total);
        this.input.setText("");
        button.setEnabled(false);

    }
}
