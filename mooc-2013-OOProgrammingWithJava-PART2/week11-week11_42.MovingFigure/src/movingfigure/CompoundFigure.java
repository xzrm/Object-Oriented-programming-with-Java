/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author kraczlam5898
 */
public class CompoundFigure extends Figure {

    private ArrayList<Figure> figures;

    public CompoundFigure() {
        super(100, 100);
        this.figures = new ArrayList<Figure>();
    }

    public void add(Figure f) {
        figures.add(f);
    }

    @Override
    public void draw(Graphics graphics) {
        for (Figure f : figures) {
            f.draw(graphics);
        }

    }

    public void move(int movingX, int movingY) {
        for (Figure f : figures) {
            f.move(movingX, movingY);
        }

    }
}