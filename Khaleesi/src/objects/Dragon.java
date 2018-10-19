package objects;

/**
 *
 * @author htogarcia
 */
public class Dragon extends Character {
    
    protected int speed = 0;
    protected Dragon father;
    protected int life = 0;
    protected String range; // coronel / general / soldier / infantry
    
    public Dragon (int x, int y, int id) {
        super(x, y, id);
        this.image_base = "images/charizard";
        this.life = 50;
        
    }
    
}
