import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;

public class ParryWindow extends JFrame{
    private boolean parried;
    private CountDownLatch latch;

    // constructor
    public ParryWindow(CountDownLatch latch) {
        // Calls from the upper class using the "super"
        super("Parry Window");
        this.latch = latch;
        this.parried = false;

        setSize(200, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // centers in the screen
        setAlwaysOnTop(true);

        JButton parryButton = new JButton("Parry!");
        parryButton.addActionListener(new ActionListener() {@Override
            public void actionPerformed(ActionEvent e) {
                parried = true;
                System.out.println("Parried");
                latch.countDown();
                dispose();
            }
        });

        getContentPane().add(parryButton);

        // timer function
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {@Override
            public void run() {
                parried = false;
                latch.countDown();
                dispose();
            }
        }, 2000);
    }

    // Getter and Setter
    public boolean isParried() {return this.parried;}

    // Methods
    public static void createAndShow(CountDownLatch latch) {
        SwingUtilities.invokeLater(() -> {
            ParryWindow window = new ParryWindow(latch);
            window.setVisible(true);
        });
    }
}