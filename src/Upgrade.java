public class Upgrade {

    private int noOfThis;
    private final int price;
    private final int cps;
    private final String name;


    public Upgrade(int noOfThis, int price, int cps, String name) {
        this.noOfThis = noOfThis;
        this.price = price;
        this.cps = cps;
        this.name = name;
    }

    public void addOne() {
        noOfThis++;
    }

    public int getNoOfThis() {
        return noOfThis;
    }

    public int getCps() {
        return noOfThis * cps;
    }

    public boolean canBuy(int cookieCount) {
        return price <= cookieCount;
    }
    public int getPrice() {
        return this.price;
    }
}
