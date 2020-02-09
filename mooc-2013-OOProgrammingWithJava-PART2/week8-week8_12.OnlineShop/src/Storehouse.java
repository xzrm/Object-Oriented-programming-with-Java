
import java.util.*;

public class Storehouse {

    private Map<String, Integer> prodPrice;
    private Map<String, Integer> prodStock;

    public Storehouse() {
        this.prodPrice = new HashMap<String, Integer>();
        this.prodStock = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock) {
        this.prodPrice.put(product, price);
        this.prodStock.put(product, stock);
    }

    public int stock(String product) {
        if (!this.prodStock.containsKey(product)) {
            return 0;
        }
        return this.prodStock.get(product);

    }

    public int price(String product) {
        if (!this.prodPrice.containsKey(product)) {
            return -99;
        }
        return this.prodPrice.get(product);

    }

    public boolean take(String product) {
        for (String p : this.prodPrice.keySet()) {
            if (p.equals(product) && this.stock(product) > 0) {
                this.prodStock.put(product, this.stock(product) - 1);
                return true;
            }
        }
        return false;
    }

    public Set<String> products() {
        return this.prodPrice.keySet();
    }
}
