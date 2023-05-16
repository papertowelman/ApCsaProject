import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

public class Game {
    private int count;
    private final Cursor cursor;
    private final TimerTask timerTask;
    private final Timer timer;
    public Game(){
        cursor = new Cursor();
        timer = new Timer();
        this.timerTask = new TimerTask() {
            @Override
            public void run() {
                count += cursor.getCps();
            }
        };
        timer.scheduleAtFixedRate(this.timerTask, 0, 1000);
    }
    public void countUp(int val){
        count+= val;
    }

    public int getCount() {
        return count;
    }
    public void addCursor(){
        cursor.addOne();
    }
    public void setCount(int set){
        count = set;
    }
}
