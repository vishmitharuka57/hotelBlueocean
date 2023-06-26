package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ReceptionistDashBoardFormController {
    public AnchorPane receptionistDashboardContext;

    public void openDashBoardPage(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) receptionistDashboardContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/DashBoardReceptionistForm.fxml"))));
    }

    public void openReservedRoomPage(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) receptionistDashboardContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ReservedRoomsReceptionistForm.fxml"))));
    }

    public void openGuestdetailPage(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) receptionistDashboardContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/GuestDetailReceptionistForm.fxml"))));
    }

    public void openMealPlanPage(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) receptionistDashboardContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/MealPackageReceptionistForm.fxml"))));
    }

    public void openRoomPlanPage(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage)receptionistDashboardContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/RoomPlanReceptionistForm.fxml"))));
    }

    public void backToReceptionistForm(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage)receptionistDashboardContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ReceptionistForm.fxml"))));
    }
}
