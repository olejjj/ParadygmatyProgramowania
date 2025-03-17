package pl.kolejnik.datamodels;

public class Product implements IComparableObject{

    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(IComparableObject other) {
        Product otherProduct = (Product) other;
        return Double.compare(this.price, otherProduct.price);
    }

    @Override
    public String toString() {
        return name + " " + price + " zł";
    }
}
