package objects;

/**
 * Template for Dragons / Griffins / ...
 * @author htogarcia
 */
public class Character {
    
    public int x = 0;
    public int y = 0;
    public int id = 0;
    public int life = 0;
    public String image_base = "";
    
    public Character (int x, int y, int id) {
        this.x = x;
        this.y = y;
        this.id = id;
    }
    
}
