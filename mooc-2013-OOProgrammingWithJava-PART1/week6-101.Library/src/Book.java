/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kraczlam5898
 */

public class Book {
    private String title;
    private String publisher;
    private int year;

    public Book(String title, String publisher, int year) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
    }

    public String title() {
        return title;
    }

    public int year() {
        return year;
    }

    public String publisher() {
        return publisher;
    }

    public String toString() {
        return this.title() + ", " + this.publisher() + ", " + this.year(); //To change body of generated methods, choose Tools | Templates.
    } 
    
    
    
    
    
}
