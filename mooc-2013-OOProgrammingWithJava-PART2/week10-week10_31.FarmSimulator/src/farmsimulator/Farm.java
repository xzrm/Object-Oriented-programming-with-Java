/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.*;

public class Farm implements Alive {

    private String owner;
    private Barn barn;
    private ArrayList<Cow> cows;

    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;
        this.cows = new ArrayList<Cow>();
    }

    public String getOwner() {
        return owner;
    }
    
    public void installMilkingRobot(MilkingRobot robot){
        this.barn.installMilkingRobot(robot);
    }
    
    

    public void addCow(Cow cow) {
        this.cows.add(cow);
    }

    @Override
    public void liveHour() {
        for (Cow cow : cows) {
            cow.liveHour();
        }
    }
    
    public void manageCows(){
        this.barn.takeCareOf(cows);
    }
    
    public String printCows(){
        String cowsText = "";
        for(Cow cow: cows){
            cowsText = cowsText + "        " + cow.toString() + "\n";
        }
        return cowsText;
    }

    @Override
    public String toString() {
        if(cows.size()==0){
            return "Farm owner: " + this.owner + "\n" + "Barn bulk tank: " 
                    + this.barn.getBulkTank().toString() + "\nNo cows";
        }
        return "Farm owner: " + this.owner + "\n" + "Barn bulk tank:" 
                    + this.barn.getBulkTank().toString() + "\nAnimals: \n" + this.printCows();
    }
    
    

}
