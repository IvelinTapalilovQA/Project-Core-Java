package skillo.W3resourseOOP.Inventory;

public class Main {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Product productOne = new Product("Laptops" , 80);
        Product productTwo = new Product("Tablets", 70);

        inventory.addProduct(productOne);
        inventory.addProduct(productTwo);

        inventory.checkLowInventory();
    }
}
