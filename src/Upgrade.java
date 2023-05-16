public abstract class Upgrade {

    private int noOfThis;
    private int valOfUpgrade;
    public Upgrade(int noOfThis, int valOfUpgrade){
        this.noOfThis = noOfThis;
        this.valOfUpgrade = valOfUpgrade;
    }
    public void addOne(){
        noOfThis++;
    }

    public int getValOfUpgrade() {
        return valOfUpgrade;
    }
    public int getNoOfThis(){
        return noOfThis;
    }
}
