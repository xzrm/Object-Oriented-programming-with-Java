/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;

import java.util.Comparator;
import java.util.Map;
import reference.domain.Person;

/**
 *
 * @author kraczlam5898
 */
public class PersonComparator implements Comparator<Person> {

    private Map<Person, Integer> ids;

    public PersonComparator(Map<Person, Integer> peopleIdentities) {
        this.ids = peopleIdentities;
    }

    public int compare(Person one, Person two) {
        return ids.get(two) - ids.get(one);
    }
}
