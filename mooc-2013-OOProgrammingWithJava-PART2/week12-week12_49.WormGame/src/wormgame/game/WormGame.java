package wormgame.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import wormgame.Direction;
import wormgame.domain.Apple;
import wormgame.domain.Piece;
import wormgame.domain.Worm;
import wormgame.gui.Updatable;

public class WormGame extends Timer implements ActionListener {

    private int width;
    private int height;
    private boolean continues;
    private Updatable updatable;
    private Worm worm;
    private Apple apple;
    private Random random = new Random();

    public WormGame(int width, int height) {
        super(1000, null);

        this.width = width;
        this.height = height;
        this.continues = true;
        this.worm = new Worm(width / 2, height / 2, Direction.DOWN);
        this.apple = new Apple(getRandomInt(0, width - 1), getRandomInt(0, height - 1));

        if (worm.runsInto(apple)) {
            this.apple = new Apple(getRandomInt(0, width - 1), getRandomInt(0, height - 1));
        }

        addActionListener(this);
        setInitialDelay(2000);

    }

    public Worm getWorm() {
        return this.worm;
    }

    public void setWorm(Worm worm) {
        this.worm = worm;
    }

    public Apple getApple() {
        return this.apple;
    }

    public void setApple(Apple apple) {
        this.apple = apple;
    }

    public int getRandomInt(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

    public boolean continues() {
        return continues;
    }

    public void setUpdatable(Updatable updatable) {
        this.updatable = updatable;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (!continues) {
            return;
        }
        worm.move();
        if (worm.runsInto(apple)) {
            worm.grow();
            this.apple = new Apple(getRandomInt(0, width), getRandomInt(0, height));
        }
        if (worm.runsIntoItself()) {
            this.continues = false;
        }
        worm = getWorm();
        Piece lastPiece = worm.getPieces().get(worm.getLength() - 1);

        if (lastPiece.getX() < 0 || lastPiece.getX() == width) {
            this.continues = false;
        }
        if (lastPiece.getY() < 0 || lastPiece.getY() == height) {
            this.continues = false;
        }

        updatable.update();
        setDelay(1000 / worm.getLength());

    }
}
