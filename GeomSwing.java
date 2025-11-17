import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class GeomSwing extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // (same drawing as the applet example - reuse shapes)
        g2.setColor(new Color(245, 245, 255));
        g2.fillRect(0,0,getWidth(),getHeight());
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(2f));
        g2.drawLine(20,30,220,30);
        g2.drawString("Line",230,35);
        g2.setColor(new Color(200,230,255));
        g2.fillRect(20,50,120,80);
        g2.setColor(Color.BLUE);
        g2.drawRect(20,50,120,80);
        g2.drawString("Rectangle",150,90);
        g2.setColor(new Color(255,230,200));
        g2.fillRoundRect(20,140,120,80,20,20);
        g2.setColor(Color.ORANGE);
        g2.drawRoundRect(20,140,120,80,20,20);
        g2.drawString("Rounded Rect",150,180);
        g2.setColor(new Color(220,255,220));
        g2.fillOval(260,50,120,120);
        g2.setColor(Color.GREEN.darker());
        g2.drawOval(260,50,120,120);
        g2.drawString("Circle/Oval",260,180);
        Ellipse2D ellipse = new Ellipse2D.Double(420,50,160,100);
        g2.setColor(new Color(255,240,240));
        g2.fill(ellipse);
        g2.setColor(Color.RED);
        g2.draw(ellipse);
        g2.drawString("Ellipse",420,160);
        int[] xPoints = {320, 380, 260};
        int[] yPoints = {240, 320, 320};
        Polygon tri = new Polygon(xPoints, yPoints, 3);
        g2.setColor(new Color(230,230,255));
        g2.fillPolygon(tri);
        g2.setColor(Color.MAGENTA.darker());
        g2.drawPolygon(tri);
        g2.drawString("Triangle (Polygon)",260,340);
        g2.setColor(new Color(240,255,220));
        g2.fillArc(420,200,120,120,30,210);
        g2.setColor(Color.BLACK);
        g2.drawArc(420,200,120,120,30,210);
        g2.drawString("Arc / Sector",420,340);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Geometrical Figures");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new GeomSwing());
        frame.setSize(620,420);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
