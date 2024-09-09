import java.awt.Graphics;
import javax.swing.JComponent;

public class helloComponent  extends  JComponent{

    public void paintComponent(Graphics g){

        g.drawString("Hello World java", 125, 95);
    }
    
}
