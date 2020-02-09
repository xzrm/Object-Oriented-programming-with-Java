
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
public class ClickListenerMinus implements ActionListener {

    private Calculator calculator;
    private JTextField input;
    private JTextField output;
    private JButton button;

    public ClickListenerMinus(Calculator calculator, JTextField input, JTextField output, JButton button) {
        this.calculator = calculator;
        this.input = input;
        this.output = output;
        this.button = button;
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int num = Integer.parseInt(this.input.getText());
            this.calculator.subtructFromTotal(num);

            String total = Integer.toString(this.calculator.getTotal());
            this.output.setText(total);
            this.input.setText("");
            if (this.calculator.getTotal() != 0) {
                this.button.setEnabled(true);
            }
            
        } catch (NumberFormatException a) {
            this.input.setText("");
        }
    }

}
