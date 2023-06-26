package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ReservedRoomsReceptionistFormController {
    public JFXTextField txtName;
    public JFXTextField txtNic;
    public JFXTextField txtTelephone;
    public JFXTextField txtEmail;
    public JFXTextField txtAddress;
    public JFXTextField txtRoomType;
    public JFXTextField txtRoomNumber;
    public JFXTextField txtCheckIn;
    public JFXTextField txtCheckOut;
    public AnchorPane roomReservationReceptionistContext;

    public void SaveDetailsBtn(ActionEvent actionEvent) {
    }

    public void backToReceptionistDashBoard(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) roomReservationReceptionistContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ReceptionistDashBoardForm.fxml"))));
    }
}
