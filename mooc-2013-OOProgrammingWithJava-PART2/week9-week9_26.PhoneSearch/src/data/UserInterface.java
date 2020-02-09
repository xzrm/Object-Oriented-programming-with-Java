/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.*;

public class UserInterface {

    private Scanner reader;
    private People people;

    public UserInterface() {
        this.people = new People();
        this.reader = new Scanner(System.in);
    }

    public void start() {

        System.out.println("phone search\n"
                + "available operations:\n"
                + " 1 add a number\n"
                + " 2 search for a number\n"
                + " 3 search for a person by phone number\n"
                + " 4 add an address\n"
                + " 5 search for personal information\n"
                + " 6 delete personal information\n"
                + " 7 filtered listing\n"
                + " x quit");
        while (true) {
            System.out.print("\ncommand: ");
            String command = reader.nextLine();
            if (command.equals("1")) {
                this.addNumber();
            } else if (command.equals("2")) {
                this.searchNumber();
            } else if (command.equals("3")) {
                this.searchPersonByNumber();
            } else if (command.equals("4")) {
                this.addAddress();
            } else if (command.equals("5")) {
                this.searchPersonalInfo();
            } else if (command.equals("6")) {
                this.deleteInfo();
            } else if (command.equals("7")) {
                this.filterList();
            } else if (command.equals("x")) {
                break;
            }
        }
    }
    //1
    public void addNumber() {
        System.out.print("whose number: ");
        String name = reader.nextLine();
        System.out.print("number: ");
        String number = reader.nextLine();
//        System.out.println(people.getPeople().size());

        people.addPerson(name);
        people.getPerson(name).addNumber(number);
    }
    //2
    public void searchNumber() {
        System.out.print("whose number: ");
        String name = reader.nextLine();

        Person person = people.getPerson(name);
        if (person == null) {
            System.out.println("  not found");
        } else {
            person.printNumbers(0);
        }
    }
    //3
    public void searchPersonByNumber() {
        System.out.print("number: ");
        String number = reader.nextLine();
        if (!people.getPersonByNumber(number)) {
            System.out.println(" not found");
        }
    }

    //4
    public void addAddress() {
        System.out.print("whose address: ");
        String name = reader.nextLine();
        System.out.print("street: ");
        String street = reader.nextLine();
        System.out.print("city: ");
        String city = reader.nextLine();

        people.addPerson(name);
        people.getPerson(name).addAddress(street, city);

    }

    //5
    public void searchPersonalInfo() {
        System.out.print("whose information: ");
        String name = reader.nextLine();
        Person person = people.getPerson(name);
        if (person != null) {
            if (person.hasAddress()) {
                person.printAddress();
            } else {
                System.out.println("  address unknown");
            }

            if (person.hasNumber()) {
                System.out.println("  phone numbers: ");
                person.printNumbers(2);
            } else {
                System.out.println("  phone number not found");
            }
        } else {
            System.out.println("  not found");
        }
    }
    //6

    public void deleteInfo() {
        System.out.print("whose information: ");
        String name = reader.nextLine();
        people.removeInfo(name);
    }

    //7
    public void filterList() {
        //can be improve by creating a method hasEntry(). 
        //by iterating over already created person object we filter out these
        //that have entry with hasEntry(). Then for these objects we sort() and get output
        System.out.print("keyword (if empty, all listed): ");
        String key = reader.nextLine();
        people.clearKeySearch();
        people.doKeySearch(key);
        people.sort();
        ArrayList<Person> results = people.getKeySearchResultsList();
        if (results.isEmpty()) {
            System.out.println(" keyword not found");
        } else {
            for (Person person : results) {
                System.out.println("");
                System.out.println(" " + person.getName());
                if (person.hasAddress()) {
                    person.printAddress();
                } else {
                    System.out.println("  address unknown");
                }

                if (person.hasNumber()) {
                    System.out.println("  phone numbers: ");
                    person.printNumbers(2);
                } else {
                    System.out.println("  phone number not found");
                }
            }
        }
    }
}
