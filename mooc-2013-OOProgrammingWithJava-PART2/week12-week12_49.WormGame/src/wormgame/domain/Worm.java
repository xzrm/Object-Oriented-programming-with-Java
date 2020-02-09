/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.domain;

import java.util.ArrayList;
import java.util.List;
import wormgame.Direction;

/**
 *
 * @author kraczlam5898
 */
public class Worm {

    private int originalX;
    private int originalY;
    private Direction originalDirection;
    private List<Piece> pieces;
    private boolean grow;

    public Worm(int originalX, int originalY, Direction originalDirection) {
        this.originalX = originalX;
        this.originalY = originalY;
        this.originalDirection = originalDirection;
        this.pieces = new ArrayList<Piece>();
        this.pieces.add(new Piece(originalX, originalY));
        this.grow = false;
    }

    public Direction getDirection() {
        return originalDirection;
    }

    public void setDirection(Direction dir) {
        originalDirection = dir;
    }

    public int getLength() {
        return getPieces().size();
    }

    public List<Piece> getPieces() {
        return pieces;
    }

    public void move() {
        int newX = pieces.get(pieces.size() - 1).getX();
        int newY = pieces.get(pieces.size() - 1).getY();

        if (originalDirection == Direction.RIGHT) {
            newX++;
        } else if (originalDirection == Direction.LEFT) {
            newX--;
        } else if (originalDirection == Direction.UP) {
            newY--;
        } else {
            newY++;
        }

        if (this.getLength() > 2 && !grow) {
            pieces.remove(0);
        }

        if (grow) {
            grow = false;
        }

        pieces.add(new Piece(newX, newY));

    }

    public void grow() {
        grow = true;
    }

//    public boolean runsInto(Piece piece) {
//        for (int i = 0; i < getLength(); i++) {
//            if (pieces.get(i).runsInto(pieces.get(i))) {
//                return true;
//            }
//            
//        }return false;
//    }
    public boolean runsInto(Piece piece) {
        for (int i = 0; i < getLength(); i++) {
            if (pieces.get(i).getX() == piece.getX() && pieces.get(i).getY() == piece.getY()) {
                return true;
            }
        }

        return false;
    }

    public boolean runsIntoItself() {
        Piece lastPiece = pieces.get(pieces.size() - 1);
        for (int i = 0; i < getLength() - 2; i++) {
            if (lastPiece.runsInto(pieces.get(i))) {
                return true;
            }
        }
        return false;
    }

}
