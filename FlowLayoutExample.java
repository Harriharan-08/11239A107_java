import java.awt.*;
import java.awt.event.*;

public class FlowLayoutExample {
    public static void main(String[] args) {

        Frame f = new Frame("FlowLayout Example");

        f.setLayout(new FlowLayout());

        // Adding Buttons
        f.add(new Button("Button 1"));
        f.add(new Button("Button 2"));
        f.add(new Button("Button 3"));
        f.add(new Button("Button 4"));
        f.add(new Button("Button 5"));

        f.setSize(400, 200);
        f.setVisible(true);

        // Close window
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
