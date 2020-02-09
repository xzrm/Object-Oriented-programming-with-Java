/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author kraczlam5898
 */
public class KeyboardListener implements KeyListener {

    private Figure fig;
    private Component component;

    public KeyboardListener( Component component, Figure fig) {
        this.fig = fig;
        this.component = component;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            fig.move(-1, 0);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            fig.move(1, 0);
        }else if (e.getKeyCode() == KeyEvent.VK_UP) {
            fig.move(0, -1);
        }else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            fig.move(0, 1);
        }

        component.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}
