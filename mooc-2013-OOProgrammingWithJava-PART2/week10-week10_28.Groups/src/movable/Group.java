/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

import java.util.ArrayList;

public class Group implements Movable {

    private ArrayList<Movable> listOrganisms;

    public Group() {
        this.listOrganisms = new ArrayList<Movable>();
    }

    public String toString() {
        String all = "";
        for (Movable organism : this.listOrganisms) {
            all = all + organism.toString() + "\n";
        }
        return all;
    }

    public void addToGroup(Movable movable) {
        this.listOrganisms.add(movable);
    }
    
    public ArrayList<Movable> getList(){
        return this.listOrganisms;
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable organism : listOrganisms) {
            organism.move(dx, dy);
        }
    }

}
