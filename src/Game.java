import java.util.Timer;
import java.util.TimerTask;
import java.util.*;

public class Game {
    private int count;
    private final Cursor CURSOR;
    private ArrayList<Upgrade> upgrades;
    private final TimerTask TIMER_TASK;
    private final Timer TIMER;
    public Game(){
        upgrades = new ArrayList<Upgrade>();
        CURSOR = new Cursor();
        upgrades.add(CURSOR);
        TIMER = new Timer();
        this.TIMER_TASK = new TimerTask() {
            @Override
            public void run() {
                count += upgrades.get(0).getCps();
            }
        };
        TIMER.scheduleAtFixedRate(this.TIMER_TASK, 0, 1000);
    }
    public void countUp(int val){
        count+= val;
    }

    public int getCount() {
        return count;
    }
    public void addCursor(){
        upgrades.get(0).addOne();
    }
    public void setCount(int set){
        count = set;
    }
}
