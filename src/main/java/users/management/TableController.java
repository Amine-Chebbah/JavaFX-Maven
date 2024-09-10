package users.management;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class TableController {
    
    @FXML
    private TableView<Person> tableView;
    
    @FXML
    private TableColumn<Person, String> nameColumn;
    
    @FXML
    private TableColumn<Person, String> emailColumn;
    
    @FXML
    private TableColumn<Person, String> phoneColumn;
    
    @FXML
    private TableColumn<Person, String> addressColumn;
    
    @FXML
    private TableColumn<Person, String> cityColumn;
    
    @FXML
    private TableColumn<Person, String> stateColumn;
    
    @FXML
    private TableColumn<Person, Integer> zipColumn;

    private final ObservableList<Person> data = FXCollections.observableArrayList(
    		 new Person("John Doe", "john@example.com", "555-1234", "123 Elm St", "Springfield", "IL", 62701),
             new Person("Jane Smith", "jane@example.com", "555-5678", "456 Oak St", "Springfield", "IL", 62702),
             new Person("Emily Johnson", "emily@example.com", "555-8765", "789 Pine St", "Springfield", "IL", 62703),
             new Person("Michael Brown", "michael@example.com", "555-4321", "101 Maple St", "Springfield", "IL", 62704),
             new Person("Sarah Davis", "sarah@example.com", "555-6789", "202 Birch St", "Springfield", "IL", 62705),
             new Person("John Doe", "john@example.com", "555-1234", "123 Elm St", "Springfield", "IL", 62701),
             new Person("Jane Smith", "jane@example.com", "555-5678", "456 Oak St", "Springfield", "IL", 62702),
             new Person("Emily Johnson", "emily@example.com", "555-8765", "789 Pine St", "Springfield", "IL", 62703),
             new Person("Michael Brown", "michael@example.com", "555-4321", "101 Maple St", "Springfield", "IL", 62704),
             new Person("Sarah Davis", "sarah@example.com", "555-6789", "202 Birch St", "Springfield", "IL", 62705),
             new Person("John Doe", "john@example.com", "555-1234", "123 Elm St", "Springfield", "IL", 62701),
             new Person("Jane Smith", "jane@example.com", "555-5678", "456 Oak St", "Springfield", "IL", 62702),
             new Person("Emily Johnson", "emily@example.com", "555-8765", "789 Pine St", "Springfield", "IL", 62703),
             new Person("Michael Brown", "michael@example.com", "555-4321", "101 Maple St", "Springfield", "IL", 62704),
             new Person("Sarah Davis", "sarah@example.com", "555-6789", "202 Birch St", "Springfield", "IL", 62705)
        // Add more initial data as needed
    );

    @FXML
    private void initialize() {
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<>("email"));
        phoneColumn.setCellValueFactory(new PropertyValueFactory<>("phone"));
        addressColumn.setCellValueFactory(new PropertyValueFactory<>("address"));
        cityColumn.setCellValueFactory(new PropertyValueFactory<>("city"));
        stateColumn.setCellValueFactory(new PropertyValueFactory<>("state"));
        zipColumn.setCellValueFactory(new PropertyValueFactory<>("zip"));
        
        tableView.setItems(data);
    }
}
