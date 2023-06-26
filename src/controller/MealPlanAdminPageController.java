package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MealPlanAdminPageController {
    public JFXTextField txtPrice;
    public JFXTextField txtAvailability;
    public JFXTextField txtFoodType;
    public JFXTextField txtPerson;
    public TableColumn colDelete;
    public TableColumn colPrice;
    public TableColumn colAvailability;
    public TableColumn colFoodType;
    public TableColumn colPerson;
    public AnchorPane MealPlanAdminContext;

    public void modifyTable(ActionEvent actionEvent) {
    }

    public void AddNewPlan(ActionEvent actionEvent) {
    }

    public void SaveMealPlan(ActionEvent actionEvent) {
    }

    public void backToAdminDashBoard(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) MealPlanAdminContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AdminDashBoardForm.fxml"))));
    }
}
