module users.management {
    requires javafx.controls;
    requires javafx.fxml;

    opens users.management to javafx.fxml;
    exports users.management;
}
