import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        int count = 0;
        JFrame f=new JFrame("Clicker Game");
        ImageIcon cookie = new ImageIcon("resources/PerfectCookie.png");
        JButton b = new JButton(cookie);
        Rectangle x = new Rectangle(100,100,cookie.getIconWidth(),cookie.getIconHeight());
        JTextField countText = new JTextField("You have " + count + " cookies");
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
}
