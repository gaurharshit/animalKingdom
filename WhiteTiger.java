import java.awt.*;
import java.util.Random;

public class WhiteTiger extends Critter{

            public Color getColor()
        {
            return Color.WHITE;
        }




        @Override
        public String toString() {
            return "tgr";
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



