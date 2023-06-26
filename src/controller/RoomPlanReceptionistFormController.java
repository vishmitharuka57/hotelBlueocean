package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class RoomPlanReceptionistFormController {
    public AnchorPane RoomPlanReceptionistContext;
    public TableColumn colRoomType;
    public TableColumn colAvailability;
    public TableColumn colFacilities;
    public TableColumn colPerNight;
    public JFXTextField txtRoomType;
    public JFXTextField txtPerNight;
    public JFXTextField txtFacility;
    public JFXTextField txtAvailability;

    public void SaveRoomPlans(ActionEvent actionEvent) {
    }

    public void backToAReceptionistDashBoard(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage)RoomPlanReceptionistContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ReceptionistDashBoardForm.fxml"))));
    }
}
