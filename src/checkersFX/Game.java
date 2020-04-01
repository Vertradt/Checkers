package checkersFX;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;

import java.util.ArrayList;
import java.util.List;


public class Game {
    private Scene scene; //zawartość okna
    private Pane appRoot; //wszystki komponenty aplikacji
    private Pane gameRoot;// komponenty dot. gry


    public Game(Scene scene, Pane appRoot) {
        this.scene = scene;
        this.appRoot = appRoot;
        this.gameRoot = new Pane();
        appRoot.getChildren().add(gameRoot);
        initComponents();
    }


    private void initComponents() {
        Background background = new Background();
        gameRoot.getChildren().add(background);

        CheckerFactory cF1 = new CheckerFactory(0, 3, Player.PLAYER1);
        CheckerFactory cF2 = new CheckerFactory(5, 8, Player.PLAYER2);
        List<Checker> checkerList1 = cF1.buildCheckers();
        List<Checker> checkerList2 = cF2.buildCheckers();
        List<Checker> allCheckers = new ArrayList<>(checkerList1);
        allCheckers.addAll(checkerList2);

        StateManager sM = new StateManager(allCheckers);
        scene.setOnMouseClicked(sM);

        for (Checker checker : allCheckers) {
            CheckerView checkerView = new CheckerView(checker);
            checkerView.render();
            gameRoot.getChildren().add(checkerView);

        }


    }


}
