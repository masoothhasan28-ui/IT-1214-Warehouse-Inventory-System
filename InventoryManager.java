import java.util.ArrayList;

public class InventoryManager {
    private ArrayList<Product> products;

    public InventoryManager() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public void displayAll() {
        if (products.isEmpty()) {
            System.out.println("Warehouse is empty.");
        } else {
            for (Product p : products) {
                System.out.println(p);
            }
        }
    }
}
