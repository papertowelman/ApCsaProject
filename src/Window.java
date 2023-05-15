import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window {
    private int count = 0;
    private JFrame f;
    private final ImageIcon cookie;
    private final ImageIcon cursor;
    private final ImageIcon factory;
    private JButton b;
    private JButton u1;
    private JButton u2;
    private Rectangle x;
    private JTextField countText;
    public Window(){
        // init
        f=new JFrame("Clicker Game");
        cookie = new ImageIcon("resources/PerfectCookie.png");
        cursor = new ImageIcon("resources/PerfectCookie.png");
        factory = new ImageIcon("resources/PerfectCookie.png");
        b = new JButton(cookie);
        x = new Rectangle(100,100,cookie.getIconWidth(),cookie.getIconHeight());
        countText = new JTextField("You have " + count + " cookies");

        // setting things
        countText.setBounds(100, 50, 500, 50);
        countText.setEditable(false);
        countText.setOpaque(false);

        // setting buttons
        b.setBounds(x);
        b.setOpaque(false);
        b.setContentAreaFilled(false);
        b.setBorderPainted(false);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

            }
            }
        );

        // setting frame stuff
        f.setSize(1920,1080);
        f.add(b);
        f.add(countText);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public JButton getB() {
        return b;
    }

    public JTextField getCountText() {
        return countText;
    }
}
