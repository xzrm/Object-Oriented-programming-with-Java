/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kraczlam5898
 */
import java.util.*;

public class VehicleRegister {

    private HashMap<RegistrationPlate, String> owners ;

    public VehicleRegister() {
        this.owners  = new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        for (RegistrationPlate regPlate : this.owners.keySet()) {
            if (regPlate.equals(plate)) {
                return false;
            }
        }
        this.owners.put(plate, owner);
        return true;
    }
    
    public String get(RegistrationPlate plate){
        for (RegistrationPlate regPlate : this.owners.keySet()){
            if (regPlate.equals(plate)){
                return this.owners.get(regPlate);
            }
        }
        return null;
    }
    
    public boolean delete(RegistrationPlate plate){
        for (RegistrationPlate regPlate : this.owners.keySet()){
            if (regPlate.equals(plate)){
                this.owners.remove(regPlate);
                return true;
            }
        }
        return false;
    }
    
    public void printRegistrationPlates(){
        for (RegistrationPlate regPlate : this.owners.keySet()){
            System.out.println(regPlate);
        }
    }
    
    public void printOwners(){
        Set set = new HashSet();
        for (RegistrationPlate regPlate : this.owners.keySet()){
            set.add(this.owners.get(regPlate));
        }
        for (Object obj: set){
            System.out.println(obj);
        }
    }
    

}
