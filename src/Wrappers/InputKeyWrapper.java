package Wrappers;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;


public class InputKeyWrapper {
    private final HashMap<String, Integer> moveToKeyMap;

    public InputKeyWrapper() {

        //create map
        moveToKeyMap = new HashMap<>();
        moveToKeyMap.put(getMoveString(MOVE.ATTACK), 74);
        moveToKeyMap.put(getMoveString(MOVE.LEFT), 37);
        moveToKeyMap.put(getMoveString(MOVE.RIGHT), 39);
        moveToKeyMap.put(getMoveString(MOVE.UP), 38);
        moveToKeyMap.put(getMoveString(MOVE.DOWN), 40);
    }

    public int getMove(MOVE move){
        return moveToKeyMap.get(getMoveString(move));
    }

    private static String getMoveString(MOVE move){

        String moveString = "";
        switch (move) {
            case LEFT:
                moveString = "attack-left";
                break;
            case RIGHT:
                moveString = "attack-right";
                break;
            case UP:
                moveString = "attack-up";
                break;
            case DOWN:
                moveString = "attack-down";
                break;
            default :
                break;
        }

        return moveString;
    }
}
