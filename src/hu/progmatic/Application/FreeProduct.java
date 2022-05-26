package hu.progmatic.Application;

public class FreeProduct {
    private final String name;
    private int price;

    public FreeProduct(String name) {
        this.name = name;
    }

    public FreeProduct(String name, int price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "Product: " + name +
                "\nprice:" + price;
    }
}
