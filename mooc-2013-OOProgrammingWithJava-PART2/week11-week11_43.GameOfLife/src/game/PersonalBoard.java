/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import gameoflife.GameOfLifeBoard;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

public class PersonalBoard extends GameOfLifeBoard {

    private Random random = new Random();

    public PersonalBoard(int width, int height) {
        super(width, height);
    }

    @Override
    public void initiateRandomCells(double d) {
        for (int y = 0; y < super.getHeight(); y++) {
            for (int x = 0; x < super.getWidth(); x++) {
                getBoard()[x][y] = (random.nextFloat() < d);
            }
        }
    }

    @Override
    public boolean isAlive(int x, int y) {
        if (this.coordinatesValidated(x, y) == true) {
            if (getBoard()[x][y] == true) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void turnToLiving(int x, int y) {
        if (this.coordinatesValidated(x, y) == true) {
            getBoard()[x][y] = true;
        }
    }

    @Override
    public void turnToDead(int x, int y) {
        if (this.coordinatesValidated(x, y) == true) {
            getBoard()[x][y] = false;
        }
    }

    @Override
    public int getNumberOfLivingNeighbours(int x, int y) {
        int counter = 0;
        ArrayList<Map.Entry<Integer, Integer>> arr = new ArrayList<Map.Entry<Integer, Integer>>();

        for (int i = y - 1; i < y + 2; i++) {
            for (int j = x - 1; j < x + 2; j++) {
                if ((this.coordinatesValidated(j, i)) && !(i == y && j == x)) {
                    arr.add(new AbstractMap.SimpleEntry(j, i));
                }
            }
        }

        for (Entry e : arr) {
//            System.out.println(e.getKey() + ", " +  e.getValue());
            if (this.isAlive((Integer) e.getKey(), (Integer) e.getValue())) {
                counter++;
            }
        }
        return counter;
    }

    @Override
    public void manageCell(int x, int y, int livingNeighbours) {
        if ((livingNeighbours < 2) || (livingNeighbours) > 3) {
            turnToDead(x, y);
        }

        if (!isAlive(x, y)) {
            if (livingNeighbours == 3) {
                turnToLiving(x, y);
            }
        }
    }

    public boolean coordinatesValidated(int x, int y) {
        if ((x >= 0 && x < super.getWidth()) && (y >= 0 && y < super.getHeight())) {
            return true;
        }
        return false;
    }

}
