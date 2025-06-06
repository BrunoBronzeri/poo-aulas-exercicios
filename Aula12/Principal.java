import java.util.List;
import java.util.ArrayList;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;

public class Principal {
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        janela.setSize(1027,768);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        MyJPanel myJPanel = new MyJPanel();
        // janela.add(new MyJPanel());
        janela.add(myJPanel);
        janela.setVisible(true);

        myJPanel.addMouseMotionListener((MouseMotionListener) new MouseMotionListener() {
            @Override
            public void mouseMoved(MouseEvent e) {
                int xmouse = e.getX();
                int ymouse = e.getY();
                // List<Shape> toDraw = myJPanel.getToDraw();
                List<MyShape> toDraw = myJPanel.getToDraw();
                for(/*Shape*/MyShape s : toDraw) {
                    // if(s.contains(xmouse, ymouse)) {
                    if(s.getShape().contains(xmouse, ymouse)) {
                        System.out.println("Mouse está sobre a forma!");
                    }
                }
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'mouseDragged'");
            }
        });

        int x = 100, delta = 1;

        while(true) {

            if (x>1000) {
                delta = -1;
            }
            if (x<100) {
                delta = 1;
            }

            x = x + delta;

            myJPanel.getToDraw().clear();
            // myJPanel.getToDraw().add(new Rectangle2D.Double(x,100,100,200));
            // myJPanel.getToDraw().add(new Ellipse2D.Double(1000-x,100,100,200));
            myJPanel.getToDraw().add(new MyShape(new Rectangle2D.Double(x,100,100,200), true));
            myJPanel.getToDraw().add(new MyShape(new Ellipse2D.Double(1000-x,100,100,200), true));
            janela.repaint();

            // Rectangle2D r2d = (Rectangle2D)myJPanel.getToDraw().get(0);
            Rectangle2D r2d = (Rectangle2D)myJPanel.getToDraw().get(0).getShape();
            // if(myJPanel.getToDraw().get(1).intersects(r2d)) {
            if(myJPanel.getToDraw().get(1).getShape().intersects(r2d)) {
                System.out.println("Interseção detectada!");
                myJPanel.getToDraw().get(0).setFilled(true);
                myJPanel.getToDraw().get(1).setFilled(true);
            } else {
                myJPanel.getToDraw().get(0).setFilled(false);
                myJPanel.getToDraw().get(1).setFilled(false);
            }

            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
        
    }
}