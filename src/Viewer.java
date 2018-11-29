import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Viewer {
    private JFrame frame;

    public Viewer(){
        makeFrame();
    }

    private void makeFrame(){
        frame = new JFrame("Striiim");
        Container contentPane = frame.getContentPane();

        JLabel label = new JLabel("Welcome the Striiim streaming service!");
        contentPane.add(label);

        frame.pack();
        frame.setVisible(true);

    }
}
