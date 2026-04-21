import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n1. Add Item  2. View Stock  3. Exit");
            int choice = input.nextInt();

            if (choice == 1) {
                System.out.print("ID: "); int id = input.nextInt();
                System.out.print("Name: "); String name = input.next();
                System.out.print("Qty: "); int qty = input.nextInt();
                System.out.print("Price: "); double prc = input.nextDouble();
                
                manager.addProduct(new Product(id, name, qty, prc));
            } else if (choice == 2) {
                manager.displayAll();
            } else {
                break;
            }
        }
        input.close();
    }
}
