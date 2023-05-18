import java.awt.Rectangle;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Window {

    // variable deeclarations
    Game game;
    private final JFrame F;
    private final ImageIcon COOKIE;
    private final ImageIcon CURSOR;
    private final ImageIcon FACTORY;
    private final JButton B;
    private final JButton U1;
    private JButton u2;
    private final Rectangle RECT;
    private final JLabel COUNT_TEXT;
    private final TimerTask TIMER_TASK;
    private final Timer TIMER;

    public Window(Game g) {
        game = g;
        // init
        F = new JFrame("Clicker Game");
        COOKIE = new ImageIcon("resources/PerfectCookie.png");
        CURSOR = new ImageIcon("resources/cursorbuy.png");
        FACTORY = new ImageIcon("resources/PerfectCookie.png");
        U1 = new JButton(CURSOR);
        B = new JButton(COOKIE);
        RECT = new Rectangle(100, 100, COOKIE.getIconWidth(), COOKIE.getIconHeight());
        COUNT_TEXT = new JLabel("You have " + game.getCount() + " cookies");
        TIMER = new Timer();

        // setting things
        COUNT_TEXT.setBounds(100, 50, 500, 50);

        // setting buttons
        U1.setBounds(800, 100, CURSOR.getIconWidth(), CURSOR.getIconHeight());
        B.setBounds(RECT);
        B.setOpaque(false);
        B.setContentAreaFilled(false);
        B.setBorderPainted(false);

        // adding action listeners to know when button is pressed
        B.addActionListener(e -> game.countUp(1));
        U1.addActionListener(e -> {
                if (game.getCount() >= 50) {
                    game.setCount(game.getCount() - 50);
                    game.addCursor();
                }
            }
        );

        // setting frame stuff
        F.setSize(1920, 1080);
        F.add(B);
        F.add(U1);
        F.add(COUNT_TEXT);
        F.setLayout(null);
        F.setVisible(true);
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // run loop
        this.TIMER_TASK = new TimerTask() {
            @Override
            public void run() {
                COUNT_TEXT.setText("You have " + game.getCount() + " cookies");
            }
        };
        // this lets loop run every milisecond
        TIMER.scheduleAtFixedRate(this.TIMER_TASK, 0, 1);
    }
}
