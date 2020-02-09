
import calc.applicationlogic.Calculator;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {

    private JFrame frame;
    private Calculator calc;

    public GraphicCalculator(Calculator calc) {
        this.calc = calc;
    }

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(500, 300));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);

        JTextField output = new JTextField("0");
        output.setEnabled(false);
        JTextField input = new JTextField("0");
        System.out.println(input.getText());
        container.add(output);
        container.add(input);

        JPanel panel = new JPanel(new GridLayout(1, 3));
        
        JButton plusButton = new JButton("+");
        JButton minButton = new JButton("-");
        JButton resetButton = new JButton("Z");
 
        ClickListenerPlus plus = new ClickListenerPlus(calc, input, output, resetButton);
        plusButton.addActionListener(plus);

        ClickListenerMinus minus = new ClickListenerMinus(calc, input, output, resetButton);
        minButton.addActionListener(minus);

        ClickListenerZ reset = new ClickListenerZ(calc, input, output, resetButton);
        resetButton.addActionListener(reset);
        
        panel.add(plusButton);
        panel.add(minButton);
        panel.add(resetButton);
        
        container.add(panel);
    }

    public JFrame getFrame() {
        return frame;
    }
}
