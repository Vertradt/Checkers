package checkersFX.state;

import checkersFX.model.Checker;

import java.util.Optional;

public class CheckerSelectionState extends State {
    public CheckerSelectionState(StateManager stateManager) {
        super(stateManager);
    }

    @Override
    public void click(int x, int y) {
        System.out.println("Click on CheckerSelection");

        Optional<Checker> optionalChecker = stateManager.findChecker(x, y);
        if (!optionalChecker.isPresent()) {
            System.out.println("To nie checker");
            return;
        }
        Checker checker = optionalChecker.get();
        if (checker.getPlayer() != stateManager.getPlayer()) {
            System.out.println("Nie ten gracz.");
            return;
        }
        System.out.println("To jest checker " + checker);
        stateManager.changeState(StateType.MOVEMENT);
    }

    @Override
    public void setUp() {
        System.out.println("Setup on CheckerSelection");

    }
}
