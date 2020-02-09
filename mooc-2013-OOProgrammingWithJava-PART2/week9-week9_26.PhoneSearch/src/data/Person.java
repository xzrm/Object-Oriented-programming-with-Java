package data;

import java.util.*;

public class Person implements Comparable<Person> {

    private String name;
    private Set<String> numbers;
    private Set<Address> addresses;

    public Person(String name) {
        this.name = name;
        this.numbers = new HashSet<String>();
        this.addresses = new HashSet<Address>();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name; 
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getNumbers() {
        return numbers;
    }

    public void addNumber(String number) {
        this.numbers.add(number);
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void getNumber() {
        if (this.numbers.isEmpty()) {
            System.out.println("not found");
        } else {
            for (String number : this.numbers) {
                System.out.println(number);
            }
        }
    }

    public void addAddress(String street, String city) {
        this.addresses.add(new Address(street, city));
    }

    public boolean hasAddress(){
        if (this.addresses.isEmpty()){
            return false;
        }return true;
    }
    public void printAddress() {
        if (this.addresses.isEmpty()) {
            System.out.println("  address unknown");
        } else {
            for (Address address : this.addresses) {
                System.out.println("  address: " + address.getStreet()
                        + " " + address.getCity());
            }
        }
    }
    public boolean hasNumber(){
        if (this.numbers.isEmpty()){
            return false;
        }return true;
    }
    
    public void printNumbers(int addSpaces) {
        if (this.numbers.isEmpty()) {
            System.out.println("  not found");
        } else {
            for (String number : this.numbers) {
                System.out.println(" " + this.addSpaces(addSpaces) + number);
            }
        }
    }
    
    public String addSpaces(int numberOfSpaces){
        String spaces = "";
        for(int i = 0; i < numberOfSpaces; i++){
            spaces = spaces + " ";
        }
        return spaces;
    }


    @Override
    public int compareTo(Person person) {
        return this.name.compareTo(person.getName());
    }

    public boolean equals(Object object) {
        Person compared = (Person) object;
        if(this.name.equals(compared.getName())) {
            return true;
        }else{
            return false;
        }
    }
}


