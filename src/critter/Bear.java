package critter;

import java.awt.*;

/**
 * Created by mhan on 10/2/2016.
 */
public class Bear extends Critter {

    private String str;
    private Color color;

    public Bear(boolean polar){
        if(polar) {
            this.color = Color.WHITE;
        } else {
            this.color = Color.BLACK;
        }
        this.str = "/"; //initialize with slash
    }

    // Toggle str between slash and backslash
    // When str is empty it is the first time being called so return forward slash
    private void toggleStr() {
        if(str.equals("\\")) { // str is backslash
            str = "/"; //set to slash
        } else { // str is slash
            str = "\\"; //set to backslash
        }
    }

    // Action of the bear
    // Always infect if an enemy is in front
    // Otherwise hop if possible
    // Otherwise turn left
    @Override
    public Action getMove(CritterInfo info) {
        toggleStr(); // set str field

        Critter.Neighbor n = info.getFront(); //get my neighbor

        if(n == Neighbor.OTHER) {  //if an enemy is in front
            return Action.INFECT;
        } else if ( n == Neighbor.EMPTY ) { //only if it is empty I can hop
            return Action.HOP;
        } else { //all other cases: either wall or met same critter
            return Action.LEFT;
        }
    }

    // Color of the bear
    // Returns WHITE if it is a polar bear, otherwise returns BLACK
    @Override
    public Color getColor() {
        return color;
    }

    // Need to alternate between a slash and a backslash starting with a slash
    @Override
    public String toString() {
        return str;
    }
}