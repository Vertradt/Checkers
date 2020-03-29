package checkersFX;

import javafx.scene.shape.Circle;

public class CheckerView extends Circle {
    public static final int RADIUS = 20;
    private Checker checker;

    public CheckerView(Checker checker) {
        this.checker = checker;
    }

    void render() {
        setRadius(RADIUS);
        setFill(checker.getPlayer().getColor());
        setCenterX(checker.getCoordX() * Background.SIZE + (0.5 * Background.SIZE));
        setCenterY(checker.getCoordY() * Background.SIZE + (0.5 * Background.SIZE));
    }


}
