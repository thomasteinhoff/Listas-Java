import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

/* Comments for my own study and understanding */

public class ParryWindow extends JFrame{
    private boolean parried; //  boolean attribute

    // constructor
    public ParryWindow() {
        // Calls from the upper class using the "super"
        super("Parry Window");
        setSize(200, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // centers in the screen
        setAlwaysOnTop(true);

        JButton parryButton = new JButton("Parry!");
        parryButton.addActionListener(new ActionListener() {@Override
            public void actionPerformed(ActionEvent e) {
                parried = true;
                System.out.println("Parried");
                dispose();
            }
        });

        getContentPane().add(parryButton);

        // timer function
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {@Override
            public void run() {
                parried = false;
                dispose();
            }
        }, 2000);
    }

    // Getter and Setter
    public boolean isParried() {return this.parried;}

    // Method
    public static void createAndShow() {
        SwingUtilities.invokeLater(() -> {
            ParryWindow window = new ParryWindow();
            window.setVisible(true);
        });
    }
}