package users.management;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class CreationController {

    @FXML
    private VBox formContainer;

    @FXML
    private TextField nameField;

    @FXML
    private TextField emailField;

    @FXML
    private TextField phoneField;

    @FXML
    private TextField addressField;

    @FXML
    private TextField cityField;

    @FXML
    private TextField stateField;

    @FXML
    private TextField zipField;

    @FXML
    private Button submitButton;

    @FXML
    private TextArea textArea;

    @FXML
    private VBox infoContainer; 

    @FXML
    private void initialize() {
        textArea.setText("But I must explain to you how...");
    }

    @FXML
    private void addUser() {
        try {
            String name = nameField.getText();
            String email = emailField.getText();
            String phone = phoneField.getText();
            String address = addressField.getText();
            String city = cityField.getText();
            String state = stateField.getText();
            int zip = Integer.parseInt(zipField.getText());

            // Add new person to the TableController's data (requires a reference or event)

            // Clear fields after adding
            nameField.clear();
            emailField.clear();
            phoneField.clear();
            addressField.clear();
            cityField.clear();
            stateField.clear();
            zipField.clear();

            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("User Added");
            alert.setHeaderText(null);
            alert.setContentText("User has been successfully added.");
            alert.showAndWait();

        } catch (NumberFormatException e) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Zip code must be a number.");
            alert.showAndWait();
        }
    }
}
