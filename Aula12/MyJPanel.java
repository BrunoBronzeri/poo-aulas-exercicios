import java.awt.Font;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.Graphics2D;
import java.util.ArrayList;
// import java.awt.List; // Removed incorrect import
import java.util.List;

import javax.swing.JPanel;

public class MyJPanel extends JPanel {

    // private List<Shape> toDrsaw = new ArrayList<>();
    private List<MyShape> toDraw = new ArrayList<>();
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        /*g.drawRect(100,200,200,100);
        g.drawOval(500,200,200,100);

        int x[] = {100, 200, 300, 100};
        int y[] = {200, 100, 200, 100};
        g.drawPolygon(x, y, 4);

        // g.setFont(getFont().deriveFont(30f));
        g.setFont(new Font("GEORGIA", Font.BOLD, 30));
        g.drawString("Texto de Exemplo", 400, 400);*/

        for (MyShape /*Shape*/ s : toDraw) {
            g2d.draw(/*s*/ s.getShape());
            // g2d.fill(s);
            if (s.isFilled()) {
                g2d.fill(s.getShape());
                
            }
        }
    }

    //setters and getters
    /*public List<Shape> getToDraw() {
        return toDraw;
    }
    public void setToDraw(List<Shape> toDraw) {
        this.toDraw = toDraw;
    }*/

    public List<MyShape> getToDraw() {
        return toDraw;
    }
    public void setToDraw(List<MyShape> toDraw) {
        this.toDraw = toDraw;
    }
}