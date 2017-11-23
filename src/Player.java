import java.util.Random;

/**
 * @author Alexander Feyaerts
 * @version 1.0 23/11/2017 14:44
 */
public class Player {
    public static final int START_HEALTH = 9;
    private int x;
    private int y;
    private int health;
    private Random random;


    public Player(int x, int y) {
        this.x = x;
        this.y = y;
        health = START_HEALTH;
        this.random = new Random();
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
        x += random.nextInt(1);
        y += random.nextInt(1);
    }

    void attack(int damage)
    {

    }

    public boolean isDeath()
    {

        return this.health<=0;
    }


}
