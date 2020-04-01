package checkersFX;

import checkersFX.engine.Game;
import checkersFX.model.Background;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class Launcher extends Application {

    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) {
        Pane appRoot = new Pane();
        Scene scene = new Scene(appRoot, Background.SIZE * Background.ROWS, Background.SIZE * Background.COLUMNS);
        Game game = new Game(scene, appRoot);
        primaryStage.setTitle("Checkboard");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}


