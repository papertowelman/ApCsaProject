import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window {
    Game game;
    private JFrame f;
    private final ImageIcon cookie;
    private final ImageIcon cursor;
    private final ImageIcon factory;
    private JButton b;
    private JButton u1;
    private JButton u2;
    private Rectangle x;
    private JLabel countText;
    public Window(Game g){
        game = g;
        // init
        f = new JFrame("Clicker Game");
        cookie = new ImageIcon("resources/PerfectCookie.png");
        cursor = new ImageIcon("resources/cursorbuy.png");
        factory = new ImageIcon("resources/PerfectCookie.png");
        u1 = new JButton(cursor);
        b = new JButton(cookie);
        x = new Rectangle(100,100,cookie.getIconWidth(),cookie.getIconHeight());
        countText = new JLabel("You have " + game.getCount() + " cookies");

        // setting things
        countText.setBounds(100, 50, 500, 50);;

        // setting buttons
        u1.setBounds(800,100,cursor.getIconWidth(),cursor.getIconHeight());
        b.setBounds(x);
        b.setOpaque(false);
        b.setContentAreaFilled(false);
        b.setBorderPainted(false);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                game.countUp(1);
                countText.setText("You have " + game.getCount() + " cookies");
            }
            }
        );
        u1.addActionListener(new ActionListener(){
                                public void actionPerformed(ActionEvent e){
                                    game.addCursor();
                                }
                            }
        );

        // setting frame stuff
        f.setSize(1920,1080);
        f.add(b);
        f.add(u1);
        f.add(countText);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
