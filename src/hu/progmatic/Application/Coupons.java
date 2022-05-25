package hu.progmatic.Application;

public class Coupons {

    private final int id;
    private FreeProduct product;
    private boolean isActive;


    public Coupons(int id, FreeProduct product, boolean isActive) {
        this.id = id;
        this.product = product;
        this.isActive = isActive;
    }

    FreeProduct productTomato = new FreeProduct("Cherry Tomato 500g", 999);
    FreeProduct productHeinekenBeer = new FreeProduct("Heineken 0,33l",449);
    FreeProduct productWholeWheatBread = new FreeProduct("Whole Wheat Bread 500g",649);
    FreeProduct productFreshMilk = new FreeProduct("Fresh Milk 1l",349);



    Coupons coupons = new Coupons(1,productTomato,false);
    Coupons coupons2 = new Coupons(2,productHeinekenBeer,false);
    Coupons coupons3 = new Coupons(3,productWholeWheatBread,false);
    Coupons coupons4 = new Coupons(4,productFreshMilk,false);





    public int getFreeProduct(){

        return product.getPrice() * 0;
    }



    public int getId() {
        return id;
    }

    public FreeProduct getName() {
        return product;
    }

    public void setName(FreeProduct name) {
        this.product = name;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

}
