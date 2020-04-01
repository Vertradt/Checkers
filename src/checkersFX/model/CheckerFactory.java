package checkersFX.model;

import java.util.ArrayList;
import java.util.List;

public class CheckerFactory {

    private int firstRow;
    private int lastRow;
    private Player player;
   //private Player[] players = Player.values();

    public CheckerFactory(int firstRow, int lastRow, Player player) {
        this.firstRow = firstRow;
        this.lastRow = lastRow;
        this.player = player;
    }

    public List<Checker> buildCheckers() {
        List<Checker> checkers = new ArrayList<>();
        for (int i = 0; i < (Background.COLUMNS/2); i++) {
            for (int j = firstRow; j <lastRow; j++) {

                checkers.add(buildCheckersFor(j).get(i));
            }
        }

        return checkers;
    }

    private List<Checker> buildCheckersFor(int row) {
        List<Checker> checkers = new ArrayList<>();

        for (int col = 0; col < Background.COLUMNS; col++) {
            if (row % 2 == 0 && col % 2 != 0 || row % 2 != 0 && col % 2 == 0) {
                checkers.add(new Checker(col, row, player));
            }
        }
        return checkers;
    }


}
