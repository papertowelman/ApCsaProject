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
    private JButton U2;
    private final Rectangle RECT;
    private final JLabel COUNT_TEXT;
    private final JLabel CPS_TEXT;
    private final TimerTask TIMER_TASK;
    private final Timer TIMER;

    public Window(Game g) {
        game = g;
        // init
        F = new JFrame("Clicker Game");
        COOKIE = new ImageIcon("resources/cookie.png");
        CURSOR = new ImageIcon("resources/cursorbu.png");
        FACTORY = new ImageIcon("resources/Factorybuy.png");
        U1 = new JButton(CURSOR);
        B = new JButton(COOKIE);
        U2 = new JButton(FACTORY);
        RECT = new Rectangle(100, 100, COOKIE.getIconWidth(), COOKIE.getIconHeight());
        COUNT_TEXT = new JLabel("You have " + game.getCount() + " cookies");
        CPS_TEXT = new JLabel(game.getAveragePerSecond() + " cookies per second");
        TIMER = new Timer();

        // setting things
        COUNT_TEXT.setBounds(100, 50, 500, 50);
        CPS_TEXT.setBounds(100, 25, 200, 50);

        // setting buttons
        U1.setBounds(800, 100, CURSOR.getIconWidth(), CURSOR.getIconHeight());
        U2.setBounds(800,400, FACTORY.getIconWidth(), FACTORY.getIconHeight());
        B.setBounds(RECT);
        B.setOpaque(false);
        B.setContentAreaFilled(false);
        B.setBorderPainted(false);
        U2.setOpaque(false);
        U2.setContentAreaFilled(false);
        U2.setBorderPainted(false);

        // adding action listeners to know when button is pressed
        B.addActionListener(e -> game.countUp(1));
        U1.addActionListener(e -> {
                    game.buyUpgrade(0);
            }
        );
        U2.addActionListener(e -> {
                    game.buyUpgrade(1);
                }
        );

        // setting frame stuff
        F.setSize(1920, 1080);
        F.add(B);
        F.add(U1);
        F.add(U2);
        F.add(COUNT_TEXT);
        F.add(CPS_TEXT);
        F.setLayout(null);
        F.setVisible(true);
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // run loop
        this.TIMER_TASK = new TimerTask() {
            @Override
            public void run() {
                COUNT_TEXT.setText("You have " + game.getCount() + " cookies");
                CPS_TEXT.setText(game.getAveragePerSecond() + " cookies per second");
            }
        };
        // this lets loop run every milisecond
        TIMER.scheduleAtFixedRate(this.TIMER_TASK, 0, 1);
    }
}
