/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.JPanel;
import wormgame.domain.Piece;
import wormgame.game.WormGame;

/**
 *
 * @author kraczlam5898
 */
public class DrawingBoard extends JPanel implements Updatable{

    private WormGame wormGame;
    private int pieceLength;

    public DrawingBoard(WormGame wormgame, int pieceLength) {
        this.wormGame = wormgame;
        this.pieceLength = pieceLength;
    }

    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        
   
        for(Piece p: wormGame.getWorm().getPieces()){
            graphics.setColor(Color.BLACK);
            graphics.fill3DRect(p.getX()*pieceLength, p.getY()*pieceLength, pieceLength, pieceLength, true);
        }
        
        graphics.setColor(Color.RED);
        graphics.fillOval(wormGame.getApple().getX()*pieceLength, wormGame.getApple().getY()*pieceLength, pieceLength, pieceLength);
        

    }


    @Override
    public void update() {
        super.repaint();
    }

}
