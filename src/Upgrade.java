public abstract class Upgrade {

    private int noOfThis;
    private int valOfUpgrade;
    public Upgrade(int x, int y){
        noOfThis = x;
        valOfUpgrade = y;
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
