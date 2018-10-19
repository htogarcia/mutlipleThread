package GUI;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * Thread in charge of move the landscape
 * @author htogarcia
 */
public class Landscape extends Thread{
    
    protected Sky sky;
    protected final String landscapeFile = "images/landscape_mario.jpg";
    protected final int speed = 20;
    protected boolean playing = false;
    
    public Landscape (Sky sky) {
        this.sky = sky;
        this.playing = true;
    }
    
    @Override
    public void run() {
        
        JLabel landscapeLabel = new JLabel(new ImageIcon(landscapeFile));
        landscapeLabel.setBounds(0, 0, 3840, 500);
        sky.add(landscapeLabel);
        
        int newX = 0;
        while (playing) {
            newX = (newX == -3040) ? 0 : landscapeLabel.getX() - speed;
            landscapeLabel.setBounds(newX, landscapeLabel.getY(), 3840, 500);
            
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Landscape.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            sky.revalidate();
            sky.repaint();
        }
        
        //sky.components.insert(landscapeLabel);
    }
    
}
