import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class digitalckock extends JFrame {

    private JLabel timeLabel;
    private SimpleDateFormat timeFormat;

    public digitalckock() {

        setTitle("Digital Clock");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        timeFormat = new SimpleDateFormat("hh:mm:ss a");

        timeLabel = new JLabel();
        timeLabel.setBounds(0, 20, 300, 100);
        timeLabel.setFont(new Font("Arial", Font.BOLD, 40));
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);

        add(timeLabel);

        setLocationRelativeTo(null);
        setVisible(true);

        Timer timer = new Timer(1000, e -> updateWindow());
        timer.start();
    }

    private void updateWindow() {
        timeLabel.setText(timeFormat.format(new Date()));
    }

    public static void main(String[] args) {
        new digitalckock();
    }
}
