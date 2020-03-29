package checkersFX;

import java.util.ArrayList;
import java.util.List;

public class CheckerFactory {
    private Checker checker;

    public CheckerFactory(Checker checker) {
        this.checker = checker;
    }

    public List<Checker> buildCheckers() {
        List<Checker> checkers = new ArrayList<>();
        for (int i = 0; i < (Background.COLUMNS/2); i++) {
            for (int j = checker.getCoordX(); j < checker.getCoordY(); j++) {
                checkers.add(buildCheckersFor(j).get(i));
            }
        }

        return checkers;
    }

    private List<Checker> buildCheckersFor(Player player) {
        return null;

    }

    private List<Checker> buildCheckersFor(int row) {
        List<Checker> checkers = new ArrayList<>();

        for (int col = 0; col < Background.COLUMNS; col++) {
            if (row % 2 == 0 && col % 2 != 0 || row % 2 != 0 && col % 2 == 0) {
                checkers.add(new Checker(col, row, checker.getPlayer()));
            }
        }
        return checkers;
    }


}
