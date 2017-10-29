import java.awt.*;
import java.util.Random;

public class Bear extends Critter {
    static int count=0;
    public Bear(Boolean polar)
    {
    }

    public Color getColor()
    {
        count++;
        if (count%2==0) {
            return Color.WHITE;
        }
        else {
            return Color.BLACK;
        }

    }




    @Override
    public String toString() {
        if (count%2==0)
        return "/";
        else
            return  "\\";
    }


    public Action getMove(CritterInfo info)
    {
        if (info.frontThreat()==true)
        {
            return Action.INFECT;
        }
        else if((info.getFront()==Neighbor.WALL)||(info.getRight()==Neighbor.WALL))
        {
            return Action.LEFT;
        }
        else if(info.getFront()==Neighbor.SAME)
        {
            return Action.RIGHT;
        }
        else
        {
            return Action.HOP;
        }
    }

}
