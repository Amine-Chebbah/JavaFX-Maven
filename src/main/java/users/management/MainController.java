package users.management;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class MainController {

    @FXML
    private Pane mainPane; 

    @FXML
    public void initialize() {
        loadView("table"); // Load default view
    }

    @FXML
    private void showTableView() {
        loadView("table");
    }

    @FXML
    private void showCreationView() {
        loadView("creation");
    }

    private void loadView(String viewName) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/users/management/" + viewName + ".fxml"));
            Pane pane = loader.load();
            if (mainPane != null) {
                // Replace the content of the mainPane with the new pane
                mainPane.getChildren().setAll(pane);
            } else {
                System.err.println("mainPane is null");
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Failed to load view: " + viewName);
        }
    }
}
