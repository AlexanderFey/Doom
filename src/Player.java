import java.util.Random;

/**
 * @author Alexander Feyaerts
 * @version 1.0 23/11/2017 14:44
 */
public class Player {
    final int START_HEALTH = 9;
    int x;
    int y;
    int health;
    Random random = new Random();


    public Player(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHealth() {
        return health;
    }

    void move()
    {

    }

    void attack(int damage)
    {

    }

    boolean isDeath()
    {
        boolean death = false;
        if (health<=0)
        {
            death = true;
        }
        return death;
    }


}
