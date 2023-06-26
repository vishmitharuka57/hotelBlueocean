package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DashBoardReceptionistFormController {
    public AnchorPane DashBoardRecieptContext;
    public Label lblRooms;
    public Label lblAvailableRooms;
    public Label lblUnderMaintain;
    public Label lblMealPlans;
    public Label lblAlreadyBooked;

    public void backToReceptionistDashboard(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage)DashBoardRecieptContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ReceptionistDashBoardForm.fxml"))));
    }
}
