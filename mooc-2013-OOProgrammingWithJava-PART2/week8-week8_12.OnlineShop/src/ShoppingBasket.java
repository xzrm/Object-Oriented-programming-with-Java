import java.util.*;

public class ShoppingBasket {
    private Map<String, Purchase> purchases;

    public ShoppingBasket() {
        this.purchases = new HashMap<String, Purchase>();
    }
    
    public void add(String product, int price){

        if(purchases.keySet().contains(product)){
            purchases.get(product).increaseAmount();
        }else{
            this.purchases.put(product, new Purchase(product, 1, price));
        }
    }
    
   public int price(){
       int sum = 0;
       for(Purchase product: purchases.values()){
           sum += product.price();
       }
       return sum;
   }
   
   public void print(){
       for(Purchase product: purchases.values()){
           System.out.println(product);
       }
   }
    
}
