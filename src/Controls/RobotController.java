package Controls;
import java.awt.Robot;
import Wrappers.InputKeyWrapper;
import Wrappers.MOVE;

public class RobotController {

    private Robot robot;

    public RobotController(){

        try {
            robot = new Robot();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void run(){

        InputKeyWrapper keyWrapper = new InputKeyWrapper();
        for(int i =0; i < 50; i++){

            robot.delay(1000);

            robot.keyPress(keyWrapper.getMove(MOVE.UP));
            robot.keyRelease(keyWrapper.getMove(MOVE.UP));

            robot.keyPress(keyWrapper.getMove(MOVE.UP));
            robot.keyRelease(keyWrapper.getMove(MOVE.UP));

            robot.delay(1000);

            robot.keyPress(keyWrapper.getMove(MOVE.ATTACK));
            robot.keyRelease(keyWrapper.getMove(MOVE.ATTACK));

            robot.delay(1000);

            robot.keyPress(keyWrapper.getMove(MOVE.ATTACK));
            robot.keyRelease(keyWrapper.getMove(MOVE.ATTACK));
            robot.keyPress(keyWrapper.getMove(MOVE.LEFT));
            robot.keyRelease(keyWrapper.getMove(MOVE.LEFT));
            robot.keyPress(keyWrapper.getMove(MOVE.RIGHT));
            robot.keyRelease(keyWrapper.getMove(MOVE.RIGHT));
            robot.keyPress(keyWrapper.getMove(MOVE.ATTACK));
            robot.keyRelease(keyWrapper.getMove(MOVE.ATTACK));

            robot.keyPress(keyWrapper.getMove(MOVE.ATTACK));
            robot.keyRelease(keyWrapper.getMove(MOVE.ATTACK));

            robot.keyPress(keyWrapper.getMove(MOVE.LEFT));
            robot.keyRelease(keyWrapper.getMove(MOVE.LEFT));

            robot.keyPress(keyWrapper.getMove(MOVE.ATTACK));
            robot.keyRelease(keyWrapper.getMove(MOVE.ATTACK));

            robot.keyPress(keyWrapper.getMove(MOVE.ATTACK));
            robot.keyRelease(keyWrapper.getMove(MOVE.ATTACK));
            robot.keyPress(keyWrapper.getMove(MOVE.ATTACK));
            robot.keyRelease(keyWrapper.getMove(MOVE.ATTACK));
        }

    }

}
