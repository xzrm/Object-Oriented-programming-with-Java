/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Dungeon {

    private int length;
    private int height;
    private int vampires;
    private int moves;
    private boolean vampiresMove;
    private String dungeon[][];
    private User user;
    private ArrayList<Vampire> vampiresList;
    private ArrayList<Vampire> tempList;
    private Scanner reader;
    private Random rand = new Random();

    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove) {
        this.length = length;
        this.height = height;
        this.vampires = vampires;
        this.moves = moves;
        this.vampiresMove = vampiresMove;
        this.dungeon = new String[height][length];
        this.user = new User();
        this.vampiresList = new ArrayList<Vampire>();
        this.reader = new Scanner(System.in);
        this.tempList = new ArrayList<Vampire>();

    }

    public void updateDungeon() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                dungeon[i][j] = ".";
            }
        }
        this.dungeon[user.getY()][user.getX()] = "@";

        for (Vampire v : vampiresList) {
            this.dungeon[v.getY()][v.getX()] = "V";
        }
    }

    public void updateUser(String commands) {
        for (int i = 0, n = commands.length(); i < n; i++) {
            String c = String.valueOf(commands.charAt(i));
            this.moveUser(c);
            this.theSameCoords();
        }
    }

    public void updateVampires(String commands) {
        if (vampiresMove) {
            for (int i = 0, n = commands.length(); i < n; i++) {
                for (Vampire v : vampiresList) {
                    this.moveVampire(v);
                }
            }
        }
    }

    public void createVampireObjects() {
        int counter = 0;
        while (counter < vampires) {
            Vampire obj = new Vampire(length, height);
            if (!vampiresList.contains(obj) && !(user.getX() == obj.getX() && user.getY() == obj.getY())) {
                vampiresList.add(obj);
                counter++;
            }
        }
    }

    public String generateLetter() {
        String wsad = "wsad";
        String c = String.valueOf(wsad.charAt(rand.nextInt(wsad.length())));
        return c;
    }

    public void theSameCoords() {
        Vampire toRemove = null;
        for (Vampire v : vampiresList) {
            if ((user.getX() == v.getX()) && user.getY() == v.getY()) {
                toRemove = v;
            }
        }
        vampiresList.remove(toRemove);
    }

    public boolean checkBounds(Gettable object, String c) {
        int move = MoveFromKey(c);
        if ((c.equals("a")) || (c.equals("d"))) {
            if ((object.getX() + move > 0) && ((object.getX() + move) + move < length - 1)) {
                return true;
            }
        }
        if ((c.equals("w")) || (c.equals("s"))) {
            if ((object.getY() + move > 0) && ((object.getY() + move) + move < height - 1)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkForOtherVampires(Vampire object, String c) {
        int move = MoveFromKey(c);
        if (move == 0) {
            return false;
        }

        for (Vampire v : vampiresList) {
            if ((c.equals("a")) || (c.equals("d"))) {
                if ((object.getX() + move == v.getX()) && (object.getY() == v.getY())) {
                    return false;
                }
            }
            if ((c.equals("w")) || (c.equals("s"))) {
                if ((object.getX() == v.getX()) && (object.getY() + move == v.getY())) {
                    return false;
                }
            }
        }
        return true;
    }

    public void moveVampire(Vampire object) {
        String c = this.generateLetter();
        int move = MoveFromKey(c);
        if ((checkBounds(object, c)) && checkForOtherVampires(object, c)) {
            if ((c.equals("a")) || (c.equals("d"))) {
                object.setX(object.getX() + move);
            }
            if ((c.equals("w")) || (c.equals("w"))) {
                object.setY(object.getY() + move);
            }
        }
    }

    public int MoveFromKey(String c) {
        if ((c.equals("w")) || (c.equals("a"))) {
            return -1;
        }
        if ((c.equals("s")) || (c.equals("d"))) {
            return 1;
        }
        return 0;
    }

    public void moveUser(String c) {
        if ((c.equals("w")) && (user.getY() > 0)) {
            user.setY(user.getY() - 1);
        }
        if ((c.equals("s")) && (user.getY() < height - 1)) {
            user.setY(user.getY() + 1);
        }
        if ((c.equals("a")) && (user.getX() > 0)) {
            user.setX(user.getX() - 1);
        }
        if ((c.equals("d")) && (user.getX() < length - 1)) {
            user.setX(user.getX() + 1);
        }
    }

    public void printDungeon() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(dungeon[i][j]);
            }
            System.out.println("");
        }
    }

    public void printInfo() {
        System.out.println(user.toString());
        for (Vampire v : vampiresList) {
            System.out.println(v.toString());
        }
        System.out.println("");

    }

    public void run() {
        this.createVampireObjects();

        int counter = 0;
        System.out.println(moves - counter);
        System.out.println("");

        this.printInfo();

        this.updateDungeon();
        this.printDungeon();
        counter ++;

        while (counter < moves) {
            System.out.println("");
            String commands = reader.nextLine();
            System.out.println(moves - counter);
            System.out.println("");
            

            this.updateUser(commands);
            this.updateVampires(commands);
            this.updateDungeon();
            
            this.printInfo();

            this.printDungeon();
            if (vampiresList.size() == 0) {
                System.out.println("YOU WIN");
                break;
            }
            counter++;
        }
        if ((vampiresList.size() != 0)) {
            System.out.println("YOU LOSE");
        }
    }

}
