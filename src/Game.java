import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {
    Window window;
    public Game(Window w){
        window = w;
    }
    public void countUp(int val){
        window.setCount(window.getCount() + val);
        window.getCountText().setText("You have " + window.getCount() + " cookies");
    }
}
