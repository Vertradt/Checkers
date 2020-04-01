package checkersFX.model;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class Background extends Pane {
    public static final int SIZE = 50;
    public static final Color BLACK = Color.BLACK;
    public static final Color WHITE = Color.RED;
    public static final int ROWS = 8;
    public static final int COLUMNS = 8;
    private Rectangle rectangle;

    public Rectangle getRectangle() {
        return rectangle;
    }

    public Background() {

        for (int row = 0; row < ROWS; row++) {
            if (row % 2 == 0) {
                addNewRow(row, WHITE);
            } else {
                addNewRow(row, BLACK);
            }

        }
    }

    void addNewRow(int row, Color firstColor) {
        Color secColor = BLACK;
        if (firstColor == BLACK) {
            secColor = WHITE;
        }
        for (int column = 0; column < COLUMNS; column++) {
            if (column % 2 == 0) {
                addNewField(column, row, firstColor);
            } else {
                addNewField(column, row, secColor);
            }
        }

    }

    void addNewField(int col, int row, Color color) {
        rectangle = new Rectangle(col * SIZE, row * SIZE, SIZE, SIZE);
        rectangle.setFill(color);
//        StateManager stateManager = new StateManager();
//        stateManager.showCoordinates(rectangle,);
        getChildren().add(rectangle);

    }





}
