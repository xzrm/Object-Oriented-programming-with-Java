/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author kraczlam5898
 */
public class DrawingBoard extends JPanel {

    private Figure fig;

    public DrawingBoard(Figure fig) {
        this.fig = fig;
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        fig.draw(graphics);
    }

}
