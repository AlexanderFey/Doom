/**
 * @author Alexander Feyaerts
 * @version 1.0 23/11/2017 14:43
 */
public class Doom {
    private Player player;
    private Room room;

    public Doom() {
        this.player = new Player(Room.HEIGHT/2,Room.WIDTH/2);
        this.room = new Room();
    }

    public void start()
    {
        while (!player.isDeath()){
            room.update(player);
            room.draw(player);

            System.out.println("Health: "+ player.getHealth());
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
