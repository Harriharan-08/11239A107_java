import java.awt.*;
import java.awt.event.*;

public class BorderLayoutExample {
    public static void main(String[] args) {

        Frame f = new Frame("BorderLayout Example");

        f.setLayout(new BorderLayout());

        f.add(new Button("NORTH"), BorderLayout.NORTH);
        f.add(new Button("SOUTH"), BorderLayout.SOUTH);
        f.add(new Button("EAST"), BorderLayout.EAST);
        f.add(new Button("WEST"), BorderLayout.WEST);
        f.add(new Button("CENTER"), BorderLayout.CENTER);

        f.setSize(400, 200);
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
