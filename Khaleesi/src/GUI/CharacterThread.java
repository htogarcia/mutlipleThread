package GUI;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import objects.Dragon;

/**
 *
 * @author htogarcia
 */
public class CharacterThread extends Thread {
    
    /* visual variables */
    protected Sky sky;
    protected boolean playing = false;
    
    /* */
    protected Dragon character;
    
    public CharacterThread (Sky sky, Dragon character) {
        this.sky = sky;
        this.playing = true;
        this.character = character;
    }
    
    @Override
    public void run() {
        int i = 0;
        JLabel charizard = new JLabel(new ImageIcon("images/charizard0.png"));
        charizard.setBounds(character.x, character.y, 132, 89);
        sky.add(charizard);
        
        
        while (playing) {
            i = (i == 3) ? 0 : i+1;
            
            charizard.setIcon(new ImageIcon("images/charizard" + i + ".png"));
            
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                Logger.getLogger(Landscape.class.getName()).log(Level.SEVERE, null, ex);
            }
                   
        }
    }
    
}
