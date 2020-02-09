package clicker.ui;

import clicker.applicationlogic.Calculator;
import clicker.applicationlogic.PersonalCalculator;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class UserInterface implements Runnable {
    private JFrame frame;
    private Calculator calc;

    public UserInterface(PersonalCalculator calc) {
        this.frame = frame;
        this.calc = calc;
    }
    


    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(2, 1);
        container.setLayout(layout);
        
        JLabel text = new JLabel("0");
        JButton button = new JButton("Click!");
        ClickListener listener = new ClickListener(calc, text);
        button.addActionListener(listener);
        
        container.add(text);
        container.add(button);
        
        
        
        
    }

    public JFrame getFrame() {
        return frame;
    }
}
