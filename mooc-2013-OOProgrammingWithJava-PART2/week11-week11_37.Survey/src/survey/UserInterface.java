package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("");
        frame.setPreferredSize(new Dimension(200, 300));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
        // Create your app here
    }

    private void createComponents(Container container) {
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);

        container.add(new JLabel("Are you?"));

        JCheckBox a1 = new JCheckBox("Yes!");
        JCheckBox a2 = new JCheckBox("No!");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(a1);
        buttonGroup.add(a2);

        container.add(a1);
        container.add(a2);
        
        container.add(new JLabel("Why?"));

        JRadioButton a3 = new JRadioButton("No reason.");
        JRadioButton a4 = new JRadioButton("Because it is fun!");

        buttonGroup.add(a3);
        buttonGroup.add(a4);

        container.add(a3);
        container.add(a4);

        container.add(new JButton("Done!"));

    }

    public JFrame getFrame() {
        return frame;
    }
}
