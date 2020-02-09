package dungeon;

import java.util.Random;

public class Vampire implements Gettable{

    private int x;
    private int y;
    private int boundX;
    private int boundY;
    private Random rand = new Random();

    public Vampire(int boundX, int boundY) {
        this.x = rand.nextInt(boundX);
        this.y = rand.nextInt(boundY);
        this.boundX = boundX;
        this.boundY = boundY;
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


    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        Vampire compared = (Vampire) obj;

        if (this.getX() != compared.getX()) {
            return false;
        }

        if (this.getY() != compared.getY()) {
            return false;
        }

//        if((this.getX() == compared.getX()) && (this.getY() == compared.getY())){
//            return true;
//        }
        return true;
    }

    @Override
    public String toString() {
        return "v " + this.x + " " + this.y;
    }

}
