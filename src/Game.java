import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Game {

    private int count;
    private final ArrayList<Upgrade> upgrades;

    public Game() {
        upgrades = new ArrayList<Upgrade>();
        upgrades.add(new Upgrade(0, 50, 1, "Cursor"));
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                count += upgrades.get(0).getCps();
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

    public void addCursor() {
        upgrades.get(0).addOne();
    }

    public void setCount(int set) {
        count = set;
    }
}
