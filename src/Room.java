/**
 * @author Alexander Feyaerts
 * @version 1.0 23/11/2017 14:44
 */
public class Room {
    public static final int HEIGHT = 20;
    public static final int WIDTH = 90;
    char[][] floorplan;


    public Room(){
        createFloorPlan();
    }

    public void createFloorPlan()
    {
        floorplan = new char[HEIGHT + 2][WIDTH + 2];
        //opbouwen
        for(int j = 0;j<WIDTH + 2;j++){
            floorplan[0][j] = '-';
            floorplan[HEIGHT + 1][j] = '-';
        }
        for(int i = 1; i<HEIGHT +1;i++)
        {
            floorplan[i][0] = '|';
            floorplan[i][WIDTH+1] = '|';

        }
        //opvullen
        for(int i = 1;i<HEIGHT+1;i++)
        {
            for(int j = 1;j<WIDTH+1;j++)
            {
                floorplan[i][j] = ' ';
            }
        }
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
