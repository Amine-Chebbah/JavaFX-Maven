package users.management;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        // Load the FXML file
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/users/management/main.fxml"));
        BorderPane root = loader.load(); // Ensure this matches the FXML root type

        // Create the scene
        Scene scene = new Scene(root, 800, 600);

        // Load and apply the CSS stylesheet
        scene.getStylesheets().add(getClass().getResource("/users/management/style.css").toExternalForm());

        // Set the scene and show the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX Application");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
