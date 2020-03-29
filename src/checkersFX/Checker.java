package checkersFX;

public class Checker {
    private int coordX;
    private int coordY;
    private Player player;

    public Checker(int coordX, int coordY, Player player) {
        this.coordX = coordX;
        this.coordY = coordY;
        this.player = player;
    }


    public Player getPlayer() {
        return player;
    }

    public int getCoordX() {
        return coordX;
    }

    public int getCoordY() {
        return coordY;
    }

}
