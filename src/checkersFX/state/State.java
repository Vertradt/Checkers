package checkersFX.state;

public abstract class State { //ogólny state
    StateManager stateManager;

    public State(StateManager stateManager) {
        this.stateManager = stateManager;
    }

    public abstract void click(int coordX, int coordY);

    public abstract void setUp();
}
