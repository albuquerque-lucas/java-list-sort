package albuquerque.main.models;

public class Product implements Comparable<Product> {
    private static int nextId = 1;
    private final int id;
    private final String name;
    private final double price;
    public Product(String name, double price) {
        this.id = nextId++;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Product otherProduct) {
        return this.getName().compareTo(otherProduct.getName());
    }
}
