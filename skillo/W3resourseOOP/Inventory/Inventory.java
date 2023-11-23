package skillo.W3resourseOOP.Inventory;

import java.util.ArrayList;

public class Inventory {

    private ArrayList<Product> products;

    public Inventory() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void removeProduct(Product product){
        products.remove(product);
    }

    public void checkLowInventory(){
        for (Product product: products){
           if (product.getQuantity() < 100){
               System.out.println(product.getName() + " is running low on inventory. Current quantity: " + product.getQuantity());
           }
        }
    }
}
