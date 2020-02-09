/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

/**
 *
 * @author kraczlam5898
 */
public class User implements Gettable{
    private int x;
    private int y;

    public User() {
        this.x = 0;
        this.y = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    


    @Override
    public String toString() {
        return "@ " + this.x + " " +  this.y;
    }


    
    
    
    
    
    
}
