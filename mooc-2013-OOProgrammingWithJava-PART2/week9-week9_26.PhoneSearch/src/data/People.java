/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.*;

public class People {

    private ArrayList<Person> people;
    private Set<Person> keySearchResults;
    private ArrayList<Person> keySearchResultsList;

    public People() {
        this.people = new ArrayList<Person>();
        this.keySearchResults = new HashSet<Person>();
//        this.keySearchResultsList = new ArrayList<Person>();
    }

    public ArrayList<Person> getPeople() {
        return people;
    }

    public ArrayList<Person> getKeySearchResultsList() {
        return keySearchResultsList;
    }

    public void addPerson(String name) {
        Person newPerson = new Person(name);

        if (!this.people.contains(newPerson)) {
            this.people.add(newPerson);
        }
    }

    public Person getPerson(String name) {
        for (Person person : this.people) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }

    public boolean getPersonByNumber(String number) {
        for (Person person : this.people) {
            if (person.getNumbers().contains(number)) {
                System.out.println(" " + person.getName());
                return true;
            }
        }
        return false;
    }

    public Person getPersonByName(String name) {
        for (Person person : this.people) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }

    public void removeInfo(String name) {
        Person person = this.getPersonByName(name);
        if (person != null) {
            this.people.remove(person);
        }
    }

    public void clearKeySearch() {
        this.keySearchResults.clear();
    }

    public void doKeySearch(String key) {
        if (key.equals("")) {
            for (Person person : this.people) {
                this.keySearchResults.add(person);
            }
        } else {
            for (Person person : this.people) {
                if (person.getName().contains(key)) {
                    this.keySearchResults.add(person);
                }
                for (Address address : person.getAddresses()) {
                    if (address.getCity().contains(key) || address.getStreet().contains(key)) {
                        this.keySearchResults.add(person);
                    }
                }
            }
        }
    }

    public void ConvertToList() {
        this.keySearchResultsList = new ArrayList<Person>(keySearchResults);
    }

    public void sort() {
        this.ConvertToList();
        Collections.sort(this.keySearchResultsList);
    }
}
