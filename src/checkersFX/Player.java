package checkersFX;


import javafx.scene.paint.Color;

public enum Player {
    PLAYER1(Color.WHITE),
    PLAYER2(Color.BLUE);

    private Color color;

    Player(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
