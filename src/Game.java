import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Game {

    private int count;
    private final ArrayList<Upgrade> upgrades;

    public Game() {
        upgrades = new ArrayList<Upgrade>();
        upgrades.add(new Upgrade(0, 50, 1, "Cursor"));
        upgrades.add(new Upgrade(0, 200, 5, "Factory"));
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                for(int i = 0; i < upgrades.size(); i++){
                    count += upgrades.get(i).getCps();
                }
            }
        };
        timer.scheduleAtFixedRate(timerTask, 0, 1000);
    }

    public void countUp(int val) {
        count += val;
    }

    public int getCount() {
        return count;
    }

    public void buyUpgrade(int type){
        if (upgrades.get(type).canBuy(this.count)){
            this.count -= upgrades.get(type).getPrice();
            upgrades.get(type).addOne();
        }
    }
    public double getAveragePerSecond(){
        double ret = 0;
        for(Upgrade i : upgrades){
            ret += i.getCps();
        }
        return ret;
    }
}
