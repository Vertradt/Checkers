package checkersFX.state;

import checkersFX.model.Checker;

//Wzorzec Template
public class MovementState extends State {
    public MovementState(StateManager stateManager) {
        super(stateManager);
    }

    @Override
    public void click(int x, int y) {
        System.out.println("Click in MovementState");
        Checker actual = stateManager.getActualChecker();
        if (actual.getCoordX() == x && actual.getCoordY() == y) {
            System.out.println("Odznaczam pionek.");
            stateManager.changeState(StateType.CHECKER_SELECTION);

        } else {
            System.out.println("Wykonuję ruch na: " + x + " " + y);
            stateManager.changeState(StateType.CHECKER_SELECTION);
            stateManager.setNextPlayer();

        }

    }

    @Override
    public void setUp() {
        System.out.println("Setup movement");

    }
}
