/**
 * @author Alexander Feyaerts
 * @version 1.0 23/11/2017 14:44
 */
public class Room {
    public final int HEIGHT = 20;
    public final int WIDTH = 30;
    char[][] floorplan;


    public Room(){
        createFloorPlan();
    }

    public void createFloorPlan()
    {


    }

    public void update(Player player)
    {
        floorplan[player.getX()][player.getY()] = ' ';
        player.move(this);
        floorplan[player.getX()][player.getY()] = player.toString().charAt(0);

    }

    public void draw(Player player)
    {
        System.out.println();
        for (int i = 0; i<HEIGHT +2; i++)
        {
            for(int j = 0; j< WIDTH +2;j++)
            {
                System.out.print(floorplan[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public boolean isFree(int x,int y)
    {
        return floorplan[x][y] == ' ';
    }


}
