package ${packageName};

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class App extends Application {

    private static final String URL = "https://upload.wikimedia.org/wikipedia/en/c/cc/JavaFX_Logo.png";

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Hello from JavaFX with Maven");
        Group root = new Group();
        root.getChildren().add(new ImageView(URL));
        stage.setScene(new Scene(root, 600, 300));
        stage.show();
    }
}
