package hu.progmatic.Application;

public class Coupons {
    public static void main(String[] args) {
        listCoupons();



    }

    private final int id;
    private static FreeProduct product;
    private static boolean isActive;


    public Coupons(int id, FreeProduct product, boolean isActive) {
        this.id = id;
        this.product = product;
        this.isActive = isActive;
    }

    static FreeProduct productTomato = new FreeProduct("Cherry Tomato 500g", 999);
    static FreeProduct productHeinekenBeer = new FreeProduct("Heineken 0,33l",449);
    static FreeProduct productWholeWheatBread = new FreeProduct("Whole Wheat Bread 500g",649);
    static FreeProduct productFreshMilk = new FreeProduct("Fresh Milk 1l",349);




    public static void listCoupons(){

        Coupons[] coupons = {
                new Coupons(1,productTomato,false),
                new Coupons(2,productHeinekenBeer,false),
                new Coupons(3,productWholeWheatBread,false),
                new Coupons(4,productFreshMilk,false),
        };



        for (Coupons coupons1 : coupons){
            System.out.println(coupons1);
        }



    }

    @Override
    public String toString() {
        return
                "[Coupon: " + id +".\n"
                + product + "Ft\n" +
                        "Your coupon is active? " + isActive
                + "]\n\n";


    }





    public static int getFreeProduct(){

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

    public static void setActive(boolean active) {
        isActive = active;
    }


}
