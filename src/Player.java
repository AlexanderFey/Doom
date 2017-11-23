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

    @Override
    public String toString() {
        return "P";
    }

    void move(Room room)
    {
        int newX = x + (random.nextInt(3)-1);
        newX = newX <= 1 ? 1 : (newX>= Room.HEIGHT ? Room.HEIGHT : newX);

        int newY = x + (random.nextInt(3)-1);
        newY = newY <= 1 ? 1 : (newY>= Room.WIDTH ? Room.WIDTH : newY);
        if(room.isFree(newX,newY)){
            x = newX;
            y = newY;
        }else{
            if(room.isFree(x, newY)){
                y = newY;
            }else {
                if(room.isFree(newX,y)){
                    x = newX;
                }
            }
        }


    }

    void attack(int damage)
    {
        health -= damage;
        if(this.health <= 0){
            this.health = 0;
        }
    }

    public boolean isDeath()
    {

        return this.health<=0;
    }


}
