import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {
    private int count;
    private Cursor cursor;
    public Game(){
        cursor = new Cursor();
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
}
