import javax.swing.*;
import java.awt.*;

public class window {
    private int count = 0;
    private JFrame f;
    private final ImageIcon cookie;
    private JButton b;
    private Rectangle x;
    private JTextField countText;
    public window (){
        f=new JFrame("Clicker Game");
        cookie = new ImageIcon("resources/PerfectCookie.png");
        b = new JButton(cookie);
        x = new Rectangle(100,100,cookie.getIconWidth(),cookie.getIconHeight());
        countText = new JTextField("You have " + count + " cookies");
        countText.setBounds(100, 50, 500, 50);
        countText.setEditable(false);
        countText.setOpaque(false);
        b.setBounds(x);
        b.setOpaque(false);
        b.setContentAreaFilled(false);
        b.setBorderPainted(false);
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

    public JButton getB() {
        return b;
    }
}
