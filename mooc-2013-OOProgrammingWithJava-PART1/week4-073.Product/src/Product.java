/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kraczlam5898
 */
public class Product {
    private String nameAtStart;
    private double priceAtStart;
    private int amountAtStart;
    
    public Product(String name, double price, int amount){
        this.nameAtStart = name;
        this.priceAtStart = price;
        this.amountAtStart = amount;
    }
    
    public void printProduct(){
        System.out.println(this.nameAtStart + ", price " + this.priceAtStart + ", amount " + this.amountAtStart);
    }
    
    
    
}
