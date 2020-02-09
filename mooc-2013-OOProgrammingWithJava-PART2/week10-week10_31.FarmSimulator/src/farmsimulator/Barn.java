package farmsimulator;
import java.util.*;


public class Barn {

    private BulkTank tank;
    private MilkingRobot robot;

    public Barn(BulkTank tank) {
        this.tank = tank;
        this.robot = null;
    }

    public BulkTank getBulkTank() {
        return tank;

    }

    public void installMilkingRobot(MilkingRobot milkingRobot) {
        this.robot = milkingRobot;
        this.robot.setBulkTank(tank);
    }

    public void takeCareOf(Cow cow) {
        if (robot == null) {
            throw new IllegalStateException("");
        }
        this.robot.milk(cow);

    }
    
    public void takeCareOf(Collection<Cow> cows){
        for(Cow cow: cows){
            this.takeCareOf(cow);
        }
    }
    
    public String toString(){
        return this.tank.toString();
    }


}
