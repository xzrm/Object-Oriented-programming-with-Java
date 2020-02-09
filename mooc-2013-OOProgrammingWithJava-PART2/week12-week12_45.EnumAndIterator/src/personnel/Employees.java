/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author kraczlam5898
 */
public class Employees {

    private ArrayList<Person> employees;

    public Employees() {
        this.employees = new ArrayList<Person>();
    }

    public void add(Person person) {
        this.employees.add(person);
    }

    public void add(List<Person> persons) {
        for (Person p : persons) {
            this.employees.add(p);
        }
    }

    public void print() {
        Iterator<Person> iterator = this.employees.iterator();
        while (iterator.hasNext()) {
            Person p = iterator.next();
            System.out.println(p);
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = this.employees.iterator();
        while (iterator.hasNext()) {
            Person p = iterator.next();
            Education e = p.getEducation();
                if (p.getEducation() == education) 
                System.out.println(p);
            }
        }
    
    
    public void fire(Education education){
        
        Iterator<Person> iterator = this.employees.iterator();
        while (iterator.hasNext()) {
            Person p = iterator.next();
    
                if (p.getEducation() == education) 
                iterator.remove();
            }
        }
    
}
