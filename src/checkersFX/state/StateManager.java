package checkersFX.state;

import checkersFX.model.Background;
import checkersFX.model.Checker;
import checkersFX.model.Player;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

import java.util.List;
import java.util.Optional;


public class StateManager implements EventHandler<MouseEvent> {//Context
    private List<Checker> checkers;
    private Checker actualChecker;
    private State actualState = buildState(StateType.CHECKER_SELECTION);
    private Player actualPlayer = Player.PLAYER1;


    public StateManager(List<Checker> checkers) {
        this.checkers = checkers;
    }

    @Override
    public void handle(MouseEvent event) {
        int coordX = (int) (event.getX() / Background.SIZE);
        int coordY = (int) (event.getY() / Background.SIZE);
        actualState.click(coordX, coordY);
    }

    //    public Optional<Checker> findChecker(int coordX, int coordY) {
//        for (Checker actualChecker : checkers) {
//            if (hasSameCoords(coordX, coordY, actualChecker)) {
//                return Optional.of(actualChecker);
//            }
//        }
//        return Optional.empty(); //todo Realizacja wzorca Null Object Pattern - doczytaj!
//    }
    public Optional<Checker> findChecker(int coordX, int coordY) {
        return checkers.stream()
                .filter(checker -> hasSameCoords(coordX, coordY, checker))
                .findAny();
    }

    private boolean hasSameCoords(int coordX, int coordY, Checker checker) {
        return checker.getCoordX() == coordX && checker.getCoordY() == coordY;
    }

    void changeState(StateType stateType) {
        actualState = buildState(stateType);
    }

    //TODO - Factory Metod, metoda fabryczna wzorzec -
    private State buildState(StateType stateType) {
        switch (stateType) {
            default:
            case CHECKER_SELECTION:
                return new CheckerSelectionState(this);
            case MOVEMENT:
                return new MovementState(this);
        }
    }

    public void setNextPlayer() {
        if (getPlayer().equals(Player.PLAYER1)) {
            actualPlayer = Player.PLAYER2;
        } else {
            actualPlayer = Player.PLAYER1;
        }
    }


    public Player getPlayer() {
        return actualPlayer;
    }

    public Checker getActualChecker() {
        return actualChecker;
    }

    public void setActualChecker(Checker actualChecker) {
        this.actualChecker = actualChecker;
    }
}
