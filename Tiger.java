

import java.awt.*;
import java.util.Random;

public class Tiger extends  Critter {
    static int count=0;

    public  Color getColor()
    {
        Color send=Color.BLUE;
        if (count%3==0) {
            Random ran = new Random();

            int x = ran.nextInt(3);
            if (x == 0) {
                send = Color.RED;

            } else if (x == 1) {
                send = Color.GREEN;

            } else {
                send = Color.BLUE;
            }

        }
        count++;
        return send;

        }




    @Override
    public String toString() {
        return "TGR";
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


