class Product {
    int id;
    String name;
    int quantity;
    double price;

    // Constructor to initialize a product
    public Product(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Stock: " + quantity + " | Price: $" + price;
    }
}
