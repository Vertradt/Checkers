package checkersFX.model;

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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Checker{");
        sb.append("X:").append(coordX);
        sb.append("Y:").append(coordY);
        sb.append(", player=").append(player);
        sb.append('}');
        return sb.toString();
    }
}
