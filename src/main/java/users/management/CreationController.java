package users.management;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CreationController {

    @FXML
    private Label label;

    @FXML
    public void initialize() {
        label.setText("This is the Creation View");
    }
}
