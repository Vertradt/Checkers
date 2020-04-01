package checkersFX.state;
//Wzorzec Template
public class MovementState extends State {
    public MovementState(StateManager stateManager) {
        super(stateManager);
    }

    @Override
    public void click(int x, int y) {
        System.out.println("Click in MovementState");
    }

    @Override
    public void setUp() {
        System.out.println("Setup movement");

    }
}
