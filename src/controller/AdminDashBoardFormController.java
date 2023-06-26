package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminDashBoardFormController {
    public AnchorPane adminDashboardcontext;

    public void openMealPlan(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) adminDashboardcontext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/MealPlanAdminPage.fxml"))));
    }

    public void OpenRoomPlan(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) adminDashboardcontext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/RoomsAdminForm.fxml"))));
    }

    public void openIncomeReport(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) adminDashboardcontext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ItemReportAdminForm.fxml"))));
    }

    public void backToAdminForm(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) adminDashboardcontext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AdminForm.fxml"))));
    }
}
