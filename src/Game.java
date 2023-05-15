import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {
    public Game(int count, Window w){
        w.getB().addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                w.setCount(w.getCount() + 1);
                w.getCountText().setText("You have " + w.getCount() + " cookies");
                System.out.println("hi");
            }
            }
            );
    }
}
