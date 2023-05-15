import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {
    private int count;
    public Game(){

    }
    public void countUp(int val){
        count+= val;
    }

    public int getCount() {
        return count;
    }
}
