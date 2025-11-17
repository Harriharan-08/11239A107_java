import java.awt.*;
import java.awt.event.*;

public class GridLayoutExample {
    public static void main(String[] args) {

        Frame f = new Frame("GridLayout Example");

        // Grid Layout with 2 rows and 3 columns
        f.setLayout(new GridLayout(2, 3));

        f.add(new Button("1"));
        f.add(new Button("2"));
        f.add(new Button("3"));
        f.add(new Button("4"));
        f.add(new Button("5"));
        f.add(new Button("6"));

        f.setSize(400, 200);
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
