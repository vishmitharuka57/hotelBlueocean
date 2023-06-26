package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MealPackageReceptionistFormController {
    public AnchorPane MealPackageReceptionistContext;
    public TableView colPrice;
    public TableColumn colPerson;
    public TableColumn colType;
    public TableColumn colAvailability;

    public void backToReceptionistDashBoardForm(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage)MealPackageReceptionistContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ReceptionistDashBoardForm.fxml"))));
    }
}
