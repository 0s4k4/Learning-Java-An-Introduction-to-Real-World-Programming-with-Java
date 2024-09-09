
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JComponent;
import javax.swing.JFrame;


public class helloJava2 {
    
    public static void main( String[]   args){
        JFrame  frame = new JFrame("Hello Java2");
        frame.add(new helloComponent2("Hello, java"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}

class helloComponent2 extends  JComponent implements MouseMotionListener {

    String theMessage;

    int messageX = 125, messageY = 95; //ubicacion del mensaje

    public helloComponent2(String message){
        theMessage = message;
        addMouseMotionListener(this);

    }

    public void paintComponent(Graphics g){
        g.drawString(theMessage, messageX,messageY);
    }

    public void mouseDragged(MouseEvent e) {
        //recupera la ubicacion del mouse
        messageX = e.getX();
        messageY = e.getY();
        repaint();
    }

    public void mouseMoved(MouseEvent e){}

}
