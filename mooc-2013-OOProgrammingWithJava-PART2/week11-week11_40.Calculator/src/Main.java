

import calc.applicationlogic.Calculator;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        GraphicCalculator gc = new GraphicCalculator(new Calculator());
        SwingUtilities.invokeLater(gc);
    }
}
